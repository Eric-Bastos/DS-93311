package org.example.advocacia;

public class fisica extends pessoa {
    public fisica(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public String toString() {
        return "fisica{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
