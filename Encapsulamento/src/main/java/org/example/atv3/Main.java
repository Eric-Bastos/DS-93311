package org.example.atv3;

import org.example.enumatividade.Cliente;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua A", "123", "Apto 1", "12345-678", "Cidade X", UnidadeFederativa.BAHIA);
        Pessoa pessoa = new Pessoa("1", "João Silva", 30, 123456789, "eric@gmail.com", Sexo.MASCULINO, endereco);
        System.out.println(pessoa.toString());
    }
}
