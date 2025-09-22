package com.example.Aula.Model;

public enum Sexo {
    Masculino("Masculino"),
    Feminino("Feminino");

    private String texto;

    Sexo (String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
}
