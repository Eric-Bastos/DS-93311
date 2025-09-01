package org.example.empresa;

public class main {
    public static void main(String[] args) {
        endereco endereco = new endereco("Rua A", "123", "Apto 1", "12345-678", "Cidade X");
        engenheiro engenheiro = new engenheiro("João Silva", "eric@gmail.com", 5000.0f, endereco, "CREA12345");
        medico medico = new medico("Maria Souza", "luis@gmail.com", 7000.0f, endereco, "CRM67890");


        System.out.println(engenheiro);
        System.out.println(medico);

    }

}
