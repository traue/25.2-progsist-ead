package br.mack.simples;

public class TesteAssociacao {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.codigo = 1234;
        p.descricao = "Caderno universitário";
        p.qtd = 10;
        p.precoUnit = 15.50;

        Fornecedor f = new Fornecedor();
        f.codigo = 999;
        f.nome = "Tilibra";
        f.telefone = "2222-2222";

        p.setFornecedor(f); // associação feita aqui

        p.exibir();
        p.reajustar(10);
        System.out.println();
        p.exibir();

    }
}
