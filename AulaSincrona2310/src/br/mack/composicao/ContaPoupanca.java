package br.mack.composicao;

class ContaPoupanca {
    double saldo;
    void deposita(double v) {
        saldo += v;
    }

    boolean saca(double v) {
        if (v <= saldo) {
            saldo -= v;
            return true;
        }
        return false;
    }
}
