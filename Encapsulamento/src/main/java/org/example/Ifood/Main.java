package org.example.Ifood;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "01/01/1990", 1500.0, "FDS4561");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "02/02/1985", 5000.0, Bonificacao.GERENTE);

        System.out.println(motoboy);
        System.out.println(gerente);

        gerente.demitir(motoboy);

    }
}
