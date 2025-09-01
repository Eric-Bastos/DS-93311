package org.example.empresa;

public class medico extends funcionario {
    private String crm;

    public medico(String nome, String email, float salario, endereco endereco, String crm) {
        super(nome, email, salario, endereco);
        this.crm = crm;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    @Override
    public String toString() {
        return "medico{" +
                "crm='" + crm + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
