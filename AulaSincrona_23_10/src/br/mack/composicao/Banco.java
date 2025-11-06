package br.mack.composicao;

class Banco {
    private final ContaCorrente[] contas;
    private final ContaPoupanca[] poupancas;

    Banco(int qtdContas, int qtdPoup) {
        contas = new ContaCorrente[qtdContas];
        poupancas = new ContaPoupanca[qtdPoup];
        for (int i = 0; i < contas.length; i++) contas[i] = new ContaCorrente();
        for (int i = 0; i < poupancas.length; i++) poupancas[i] = new ContaPoupanca();
    }
    ContaCorrente getConta(int i) { return contas[i]; }
    ContaPoupanca getPoupanca(int i)  { return poupancas[i]; }
}
