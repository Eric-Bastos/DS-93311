package org.example.enumatividade;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("1", "João", 5000, Setor.RECURSOS_HUMANOS, Sexo.MASCULINO, 28);
        System.out.println(cliente.toString());

    }

}
