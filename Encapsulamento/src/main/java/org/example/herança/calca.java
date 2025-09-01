package org.example.herança;

public class calca extends produto {

    public calca(String marca, String cor, String tamanho, double preco) {
        super(marca, cor, tamanho, preco);
    }

    @Override
    public String toString() {
        return "calca{" +
                "marca='" + marca + '\'' +
                ", cor='" + cor + '\'' +
                ", tamanho='" + tamanho + '\'' +
                ", preco=" + preco +
                '}';
    }
}
