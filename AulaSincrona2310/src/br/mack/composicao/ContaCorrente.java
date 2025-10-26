package br.mack.composicao;

class ContaCorrente {
    double saldo;
    double chequeEspecial;

    void deposita(double v) {
        saldo += v;
    }

    boolean saca(double v) {
        if (v <= saldo + chequeEspecial) {
            saldo -= v;
            return true;
        }
        return false;
    }
}
