package org.example.advocacia;

public class juridica extends pessoa {
    public juridica(String nome, String telefone) {
        super(nome, telefone);
    }

    @Override
    public String toString() {
        return "juridica{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
