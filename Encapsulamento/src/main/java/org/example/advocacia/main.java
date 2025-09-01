package org.example.advocacia;

public class main {
    public static void main(String[] args) {
        juridica juridica = new juridica("Empresa XYZ", "1234-5678");
        fisica fisica = new fisica("João Silva", "9876-5432");

        System.out.println(juridica);
        System.out.println(fisica);
    }
}
