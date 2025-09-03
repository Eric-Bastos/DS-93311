package org.example.Entrega;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "15/03/1990", Sexo.MASCULINO, Setor.Operacoes, 2500.00, "B");
        Diretor diretor = new Diretor("Maria", "22/07/1985", Sexo.FEMININO, Setor.Financeiro, 8000.00, 2000.00);

        System.out.println(motoboy.toString());
        System.out.println(diretor.toString());


    }
}
