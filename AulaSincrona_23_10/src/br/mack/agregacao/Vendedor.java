package br.mack.agregacao;

class Vendedor {
    String nome;
    double comissao;

    void vende(double valor) {
        comissao += valor * 0.05;
    }
}

