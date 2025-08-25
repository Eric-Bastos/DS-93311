package org.example.enums;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Alice", 30, Pedido.CANCELADO);

        System.out.println(cliente1.toString());
    }
}
