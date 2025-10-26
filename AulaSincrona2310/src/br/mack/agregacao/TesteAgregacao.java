package br.mack.agregacao;

public class TesteAgregacao {
    public static void main(String[] args) {
        Produto prod = new Produto();
        prod.descricao = "Notebook";
        prod.preco = 5000.0;

        Vendedor vend = new Vendedor();
        vend.nome = "Ana";

        Comprador comp = new Comprador();
        comp.nome = "Carlos";
        comp.verba = 8000.0;

        Venda v = new Venda();
        v.produto = prod;
        v.vendedor = vend;
        v.comprador = comp;
        v.quantidade = 1;
        v.precoNegociado = 4700.0;

        v.concretiza();
        System.out.println("Venda concretizada? " + v.concretizada);
        System.out.printf("Verba do comprador: %.2f | Comissão da vendedora: %.2f%n",
                comp.verba, vend.comissao);
    }
}
