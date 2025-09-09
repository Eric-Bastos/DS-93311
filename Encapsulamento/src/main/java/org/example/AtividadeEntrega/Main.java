package org.example.AtividadeEntrega;

public class Main {
    public static void main(String[] args) {
        Motoboy motoboy = new Motoboy("João", "123.456.789-00", "MG-12.345.678", Sexo.MASCULINO, 2000.0, "01/01/1990", "01/01/2020", "ABC-1234");
        Gerente gerente = new Gerente("Maria", "987.654.321-00", "MG-87.654.321", Sexo.FEMININO, 5000.0, "02/02/1985", "01/01/2015", Bonificacao.GERENTE);
        Diretor diretor = new Diretor("Carlos", "111.222.333-44", "MG-11.222.333", Sexo.MASCULINO, 10000.0, "03/03/1980", "01/01/2010", Bonificacao.DIRETOR);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());

        diretor.admitir(gerente);






    }
}
