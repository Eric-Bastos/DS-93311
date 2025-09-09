package org.example.AtividadeEntrega;


public class Gerente extends CargoDeConfianca{

    public Gerente(String nome, String cpf, String rg, Sexo sexo, double salarioBase, String dataDeNascimento, String dataDeAdmissao, Bonificacao bonificacao) {
        super(nome, cpf, rg, sexo, salarioBase, dataDeNascimento, dataDeAdmissao, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", sexo=" + sexo +
                ", salarioBase=" + salarioBase +
                ", SalarioFinal=" + this.getSalarioFinal() +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", dataDeAdmissao='" + dataDeAdmissao + '\'' +
                '}';
    }

    @Override
    public double getSalarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }
}
