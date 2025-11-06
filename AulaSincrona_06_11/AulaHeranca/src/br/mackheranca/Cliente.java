package br.mackheranca;

public class Cliente extends Pessoa {

    private double limiteDeCrestido;

    public Cliente(String nome, int idade, double limiteDeCrestido) {
        super(nome, idade);
        this.limiteDeCrestido = limiteDeCrestido;
    }

    public void aumentarLimite(double valor) {
        limiteDeCrestido +=  valor;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Limite de credido: " + limiteDeCrestido);
    }

    public void aumentarLimite() {
        aumentarLimite(100);
    }
}
