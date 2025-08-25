package org.example.enums;

public class Cliente {
    private String nome;
    private int idade;
    private Pedido pedido;

    public Cliente(String nome, int idade, Pedido pedido) {
        this.nome = nome;
        this.idade = idade;
        this.pedido = pedido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", pedido=" + pedido +
                '}';
    }
}
