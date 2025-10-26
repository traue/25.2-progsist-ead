package br.mack.agregacao;

class Venda {
    Produto produto;
    Vendedor vendedor;
    Comprador comprador;
    int quantidade;
    double precoNegociado;
    boolean concretizada;

    void concretiza() {
        if (produto == null || vendedor == null || comprador == null) {
            throw new IllegalStateException("Venda incompleta.");
        }
        double total = precoNegociado * quantidade;
        if (comprador.verba < total) {
            throw new IllegalStateException("Comprador sem verba.");
        }
        comprador.compra(total);
        vendedor.vende(total);
        concretizada = true;
    }

    void cancela() {
        concretizada = false;
    }
}