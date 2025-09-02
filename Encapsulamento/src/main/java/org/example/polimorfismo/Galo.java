package org.example.polimorfismo;

public class Galo implements animal {
    @Override
    public String emitirSom() {
        return "Cocoricó";
    }

    @Override
    public String comer() {
        return "Ração de galo";
    }
}
