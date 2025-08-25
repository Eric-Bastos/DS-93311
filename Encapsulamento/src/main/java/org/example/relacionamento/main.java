package org.example.relacionamento;

public class main {
    public static void main(String[] args) {
        Pet pet1 = new Pet("Rex", 5, "Pastor Alemão");
        cliente cliente1 = new cliente("João", 30, pet1);

        System.out.println(cliente1);




    }

}
