package org.example.AtividadeEntrega;


public abstract class CargoDeConfianca extends Funcionario {
    protected Bonificacao bonificacao;

    public CargoDeConfianca(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataDeNascimento, String dataDeAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataDeNascimento, dataDeAdmissao);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override
    public String toString() {
        return "CargoDeConfianca{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }
}
