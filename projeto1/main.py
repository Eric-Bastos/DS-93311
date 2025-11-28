import customtkinter as ctk
import tkinter as tk

from caminhoes import open_caminhoes_window
from pecas import open_pecas_window
from fornecedores import open_fornecedores_window
from funcionarios import open_funcionarios_window
from clientes import open_clientes_window
from saidas import open_saidas_window

from sensores import SistemaSensores


def main():
    ctk.set_appearance_mode("System")
    ctk.set_default_color_theme("blue")

    root = ctk.CTk()
    root.title("Sistema - Tela Inicial")
    root.geometry("800x420")

    # Painel principal: esquerda para funcionalidades, direita para sensores
    main_frame = ctk.CTkFrame(root, corner_radius=8)
    main_frame.pack(padx=12, pady=12, fill="both", expand=True)

    left_frame = ctk.CTkFrame(main_frame)
    left_frame.pack(side="left", fill="both", expand=True, padx=(8, 4), pady=8)

    right_frame = ctk.CTkFrame(main_frame)
    right_frame.pack(side="right", fill="y", padx=(4, 8), pady=8)

    title = ctk.CTkLabel(left_frame, text="Sistema de Gerenciamento", font=ctk.CTkFont(size=20, weight="bold"))
    title.pack(pady=(10, 8))

    btn_frame = ctk.CTkFrame(left_frame)
    btn_frame.pack(pady=10, padx=10, fill="both", expand=True)

    buttons = [
        ("Caminhões", open_caminhoes_window),
        ("Peças", open_pecas_window),
        ("Fornecedores", open_fornecedores_window),
        ("Funcionários", open_funcionarios_window),
        ("Clientes", open_clientes_window),
        ("Saídas", open_saidas_window),
    ]

    for i, (label, func) in enumerate(buttons):
        btn = ctk.CTkButton(btn_frame, text=label, command=lambda f=func: f(root))
        btn.grid(row=i // 2, column=i % 2, padx=12, pady=12, sticky="nsew")

    for i in range(3):
        btn_frame.grid_rowconfigure(i, weight=1)
    for j in range(2):
        btn_frame.grid_columnconfigure(j, weight=1)

    # --- Painel de Sensores (direita) ---
    sensor_title = ctk.CTkLabel(right_frame, text="Sensores", font=ctk.CTkFont(size=16, weight="bold"))
    sensor_title.pack(pady=(6, 6))

    lbl_presenca = ctk.CTkLabel(right_frame, text="Presença: -")
    lbl_presenca.pack(pady=4)

    lbl_lum = ctk.CTkLabel(right_frame, text="Luminosidade: - lx")
    lbl_lum.pack(pady=4)

    lbl_temp = ctk.CTkLabel(right_frame, text="Temperatura: - °C")
    lbl_temp.pack(pady=4)

    separator = ctk.CTkLabel(right_frame, text="-----------------------")
    separator.pack(pady=(6, 6))

    alert_label = ctk.CTkLabel(right_frame, text="Alertas:\n-", justify="left")
    alert_label.pack(padx=8, pady=4)

    status_label = ctk.CTkLabel(right_frame, text="Status: aguardando", anchor="w")
    status_label.pack(pady=(6, 4), fill="x", padx=8)

    # Instancia o sistema de sensores e define callbacks
    sistema = SistemaSensores()

    def alerta_callback(alertas):
        texto = "\n".join(alertas)
        try:
            alert_label.configure(text=f"Alertas:\n{texto}")
        except Exception:
            pass

    def atuacao_callback(msg):
        try:
            status_label.configure(text=f"Status: {msg}")
        except Exception:
            pass

    sistema.callback_alerta = alerta_callback
    sistema.callback_atuacao = atuacao_callback

    # Update de leituras na UI a cada X ms
    def atualizar_leituras():
        dados = sistema.ler_todos()
        pres = "Sim" if dados.get("presenca") else "Não"
        lbl_presenca.configure(text=f"Presença: {pres}")
        lbl_lum.configure(text=f"Luminosidade: {dados.get('luminosidade')} lx")
        lbl_temp.configure(text=f"Temperatura: {dados.get('temperatura')} °C")
        root.after(2000, atualizar_leituras)

    # Controle start/stop
    def iniciar():
        sistema.iniciar_monitoramento(intervalo=2)
        status_label.configure(text="Status: monitorando")

    def parar():
        sistema.parar_monitoramento()
        status_label.configure(text="Status: pausado")

    btn_start = ctk.CTkButton(right_frame, text="Iniciar Monitoramento", command=iniciar)
    btn_start.pack(pady=(8, 4), padx=8, fill="x")

    btn_stop = ctk.CTkButton(right_frame, text="Parar Monitoramento", command=parar)
    btn_stop.pack(pady=(4, 10), padx=8, fill="x")

    # Inicia automaticamente
    iniciar()
    atualizar_leituras()

    def on_close():
        try:
            sistema.parar_monitoramento()
        except Exception:
            pass
        root.destroy()

    root.protocol("WM_DELETE_WINDOW", on_close)
    root.mainloop()


if __name__ == "__main__":
    main()
