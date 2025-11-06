package br.mack.simples;

public class Fornecedor {

    int codigo;
    String nome;
    String telefone;

    public void exibirDados() {
        System.out.printf("Fornecedor [%d] %s - Telefone [%s]", codigo, nome, telefone);
    }

}
