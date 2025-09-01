package org.example.advocacia;

public class main {
    public static void main(String[] args) {
        fisica fisica = new fisica("João Silva", "1234-5678", "123.456.789-00", "MG-12.345.678", "01/01/1990");
        juridica juridica = new juridica("Empresa XYZ", "9876-5432", "12.345.678/0001-00", "123.456.789.000");

        System.out.println(fisica);
        System.out.println(juridica);
    }
}
