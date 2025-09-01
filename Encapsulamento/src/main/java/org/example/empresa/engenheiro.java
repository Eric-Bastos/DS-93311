package org.example.empresa;

public class engenheiro extends funcionario {
    private String crea;

    public engenheiro(String nome, String email, float salario, org.example.empresa.endereco endereco, String crea) {
        super(nome, email, salario, endereco);
        this.crea = crea;
    }

    public String getCrea() {
        return crea;
    }

    public void setCrea(String crea) {
        this.crea = crea;
    }

    @Override
    public String toString() {
        return "engenheiro{" +
                "crea='" + crea + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
