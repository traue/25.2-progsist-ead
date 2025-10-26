package br.mack.agregacao;

class Comprador {
    String nome;
    double verba;

    void compra(double valor) {
        verba = Math.max(0, verba - valor);
    }
}
