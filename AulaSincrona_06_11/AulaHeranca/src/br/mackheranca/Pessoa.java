package br.mackheranca;

public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void fazerAniverssario() {
        idade++; // é o mesmo que idade = idade + 1
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }


}
