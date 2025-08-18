package org.example;

public class Main {
    public static void main(String[] args) {
        // instanciar a classe.
        Cliente c1 = new Cliente();
        Produto p1 = new Produto();

        // Atribuindo valores.
        // c1.nome = "Marta";
        c1.setNome("Marta");
       // c1.idade = 25;
        c1.setIdade(25);
        // p1.nome = "Notebook";
        p1.setNome("Notebook");
        // p1.preco = 3500.00;
        p1.setPreco(3500.00);

        //exibindo dados.
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("Produto: " + p1.getNome());
        System.out.println("Preço: " + p1.getPreco());
    }
}