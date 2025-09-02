package org.example.polimorfismo;

public class Gato implements animal {
    @Override
    public String emitirSom() {
        return "Miau";
    }

    @Override
    public String comer() {
        return "O gato come ração de gato";
    }
}
