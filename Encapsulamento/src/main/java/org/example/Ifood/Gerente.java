package org.example.Ifood;

public class Gerente extends CargoDeConfianca implements Contratacao {
    public Gerente(String nome, String cpf, String dataDeNascimento, double salarioBase, Bonificacao bonificacao) {
        super(nome, cpf, dataDeNascimento, salarioBase, bonificacao);
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "bonificacao=" + bonificacao +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                ", salarioBase=" + salarioBase +
                ", salarioFinal=" + this.obterSalarioFinal() +
                '}';
    }

    @Override
    public double obterSalarioFinal() {
        return super.salarioBase * super.getBonificacao().getValor();
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitir: \n" + funcionario.toString());

    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitir: \n" + funcionario.toString());

    }
}


