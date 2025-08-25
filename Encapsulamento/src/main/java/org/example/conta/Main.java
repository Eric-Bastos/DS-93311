package org.example.conta;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Banco do Brasil", "1234", "567890", "Corrente", "1000.00", "500.00");
        Funcionario f1 = new Funcionario("001", "João Silva", "Rua A, 123", "99999-9999", "eric@gmail.com", conta);
        System.out.println(f1);

    }


}
