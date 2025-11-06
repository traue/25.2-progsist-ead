package br.mack.composicao;

public class TesteComposicao {
    public static void main(String[] args) {
        Banco bb = new Banco(2, 1); // cria as partes por dentro (composição)
        bb.getConta(0).chequeEspecial = 500.0;
        bb.getConta(0).deposita(200.0);
        boolean ok = bb.getConta(0).saca(600.0); // usa saldo + cheque
        System.out.println("Saque CC ok? " + ok);

        bb.getPoupanca(0).deposita(1000.0);
        System.out.println("Saldo poup: " + bb.getPoupanca(0).saldo);
        // Ao “sumir” o Banco, as contas/poupanças também deixam de existir.
    }
}