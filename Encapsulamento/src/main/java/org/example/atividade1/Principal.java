package org.example.atividade1;

public class Principal {
    public static void main(String[] args) {

        livro l1 = new livro();
        livro l2 = new livro();

        l1.setTitulo("Os caras malvados");
        l1.setAutor("Aaron Blabey");
        l1.setNumeroDePaginas(32);
        l1.setPreco(29.90);


        l2.setTitulo("O pequeno príncipe");
        l2.setAutor("Antoine de Saint-Exupéry");
        l2.setNumeroDePaginas(96);
        l2.setPreco(39.90);

        System.out.println("Título: " + l1.getTitulo());
        System.out.println("Autor: " + l1.getAutor());
        System.out.println("Número de Páginas: " + l1.getNumeroDePaginas());
        System.out.println("Preço: " + l1.getPreco());
        System.out.println("Título: " + l2.getTitulo());
        System.out.println("Autor: " + l2.getAutor());
        System.out.println("Número de Páginas: " + l2.getNumeroDePaginas());
        System.out.println("Preço: " + l2.getPreco());




    }
}
