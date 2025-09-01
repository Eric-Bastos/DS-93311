package org.example.herança;

public class main {
    public static void main(String[] args) {
        calca calca = new calca("Levis", "Azul", "40", 199.99);
        camisa camisa = new camisa("His", "Branca", "GG", 99.99);
        sapato sapato = new sapato("Nike", "Preto", "42", 299.99);

        System.out.println(calca);
        System.out.println(camisa);
        System.out.println(sapato);
    }
}
