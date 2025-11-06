package br.mackheranca;

public class Funcionario extends Pessoa {

    protected double salario;
    protected double descontos;

    public Funcionario(String nome, int idade, double salario, double descontos) {
        super(nome, idade);
        this.salario = salario;
        this.descontos = descontos;
    }

    public double calculaSalarioLiquido() {
        return salario - descontos;
    }

    // sobrescrita (override)
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Salário brutno: " + salario);
        System.out.println("Descontos: " + descontos);
        System.out.println("Salário liquido: " + calculaSalarioLiquido());
    }
}
