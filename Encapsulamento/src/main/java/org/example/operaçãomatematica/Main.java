package org.example.operaçãomatematica;

public class Main {
    public static void main(String[] args) {
        Operacaomatematica soma = new Soma();
        Operacaomatematica subtracao = new Subtracao();
        Operacaomatematica multiplicacao = new Multiplicacao();
        Operacaomatematica divisao = new Divisao();

        double a = 10;
        double b = 5;

        System.out.println("Soma: " + soma.calcular(a, b));
        System.out.println("Subtração: " + subtracao.calcular(a, b));
        System.out.println("Multiplicação: " + multiplicacao.calcular(a, b));
        System.out.println("Divisão: " + divisao.calcular(a, b));
    }
}
