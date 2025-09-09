package org.example.AtividadeEntrega;

public enum Bonificacao {
    GERENTE(1.2),
    DIRETOR(1.4);

    private double valor;

    Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
