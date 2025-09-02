package org.example.polimorfismo;

public class main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Pato pato = new Pato();
        Galo galo = new Galo();

       System.out.println(cachorro.emitirSom() + " - " + cachorro.comer());
         System.out.println(gato.emitirSom() + " - " + gato.comer());
            System.out.println(pato.emitirSom() + " - " + pato.comer());
                System.out.println(galo.emitirSom() + " - " + galo.comer());


    }
}
