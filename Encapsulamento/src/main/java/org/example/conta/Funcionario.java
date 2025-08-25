package org.example.conta;

public class Funcionario {
    private String codigodofuncionario;
    private String nome;
    private String endereco;
    private String telefone;
    private String email;
    private ContaBancaria contabanco;

    public Funcionario(String codigodofuncionario, String nome, String endereco, String telefone, String email, ContaBancaria contabanco) {
        this.codigodofuncionario = codigodofuncionario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.contabanco = contabanco;
    }

    public String getCodigodofuncionario() {
        return codigodofuncionario;
    }

    public void setCodigodofuncionario(String codigodofuncionario) {
        this.codigodofuncionario = codigodofuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContaBancaria getContabanco() {
        return contabanco;
    }

    public void setContabanco(ContaBancaria contabanco) {
        this.contabanco = contabanco;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "codigodofuncionario='" + codigodofuncionario + '\'' +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", ContaBancaria='" + contabanco + '\'' +
                '}';
    }
}
