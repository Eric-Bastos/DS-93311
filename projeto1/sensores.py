# sensores.py
import random
import time
import threading

class SensorPresenca:
    def ler(self):
        # Simula presença aleatória
        return random.choice([True, False, False, False])

class SensorLuminosidade:
    def ler(self):
        # Retorna valor em lux (simulado)
        return random.randint(0, 100)

class SensorTemperatura:
    def ler(self):
        # Retorna temperatura simulada
        return round(random.uniform(18.0, 32.0), 1)

class SistemaSensores:
    def __init__(self, callback_alerta=None, callback_atuacao=None):
        self.sensor_presenca = SensorPresenca()
        self.sensor_luminosidade = SensorLuminosidade()
        self.sensor_temperatura = SensorTemperatura()

        # funções chamadas no main.py
        self.callback_alerta = callback_alerta
        self.callback_atuacao = callback_atuacao

        self.executando = False

    def iniciar_monitoramento(self, intervalo=2):
        self.executando = True
        threading.Thread(target=self._loop_monitoramento, args=(intervalo,), daemon=True).start()

    def parar_monitoramento(self):
        self.executando = False

    def _loop_monitoramento(self, intervalo):
        while self.executando:
            dados = self.ler_todos()
            self._verificar_alertas(dados)
            time.sleep(intervalo)

    def ler_todos(self):
        return {
            "presenca": self.sensor_presenca.ler(),
            "luminosidade": self.sensor_luminosidade.ler(),
            "temperatura": self.sensor_temperatura.ler()
        }

    def _verificar_alertas(self, dados):
        alertas = []

        if dados["presenca"]:
            alertas.append("Movimento detectado!")

        if dados["luminosidade"] < 20:
            alertas.append("Ambiente muito escuro!")

        if dados["temperatura"] > 30:
            alertas.append("Temperatura elevada!")

        if alertas and self.callback_alerta:
            self.callback_alerta(alertas)

        # Atuação simulada (pode ligar luz, ventilação, etc.)
        if self.callback_atuacao:
            if dados["presenca"] and dados["luminosidade"] < 20:
                self.callback_atuacao("Acender luz automaticamente")
            if dados["temperatura"] > 30:
                self.callback_atuacao("Acionar ventilação")

