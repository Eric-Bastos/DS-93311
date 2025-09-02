package org.example.polimorfismo;

public class Cachorro implements animal {

    @Override
    public String emitirSom() {
        return "Auau";
    }

    @Override
    public String comer() {
        return "Ração de cachorro";
    }
}
