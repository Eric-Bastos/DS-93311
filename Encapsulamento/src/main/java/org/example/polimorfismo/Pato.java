package org.example.polimorfismo;

public class Pato implements animal {
    @Override
    public String emitirSom() {
        return "Quack";
    }
    @Override
    public String comer() {
        return "O pato come ração de pato";
    }
}
