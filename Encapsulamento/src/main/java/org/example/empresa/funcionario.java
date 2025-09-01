package org.example.empresa;

public abstract class funcionario {
    protected String nome;
    protected String email;
    protected float salario;
    protected endereco endereco;

    public funcionario(String nome, String email, float salario, org.example.empresa.endereco endereco) {
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public org.example.empresa.endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(org.example.empresa.endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "funcionario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", salario=" + salario +
                ", endereco=" + endereco +
                '}';
    }
}
