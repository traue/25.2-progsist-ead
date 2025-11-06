package br.mack.simples;

public class Produto {

    int codigo;
    String descricao;
    int qtd;
    double precoUnit;
    Fornecedor fornecedor;

    public double reajustar(double porcentagem) {
        precoUnit *= (1 + porcentagem / 100.0);
        return precoUnit;
    }

    public int entrarEstoque(int qtd) {
        this.qtd += qtd;
        return this.qtd;
    }

    public int sairEstoque(int qtd) {
        this.qtd = Math.max(0, this.qtd - qtd);
        return this.qtd;
    }

    public void exibir() {
        System.out.printf("Produto [%d] %s | qtde=%d | R$ %.2f%n",
                codigo, descricao, qtd, precoUnit);
        if (fornecedor != null) {
            System.out.print("  ");
            fornecedor.exibirDados();
        }
    }

    public void setFornecedor(Fornecedor f) {
        fornecedor = f;
    }

}
