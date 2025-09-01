package org.example.polimorfismo;

public class main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        System.out.println(cachorro.emitirSom());
        System.out.println(gato.emitirSom());
    }
}
