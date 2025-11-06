package br.mackheranca;

public class TesteSistema {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Jhony", 20, 12000, 2400);
        Cliente cliente = new Cliente("Maria Mariosa", 21, 2500);

        System.out.println("****** DADOS DO FUNCIONÁRIO ******");
        func.exibirDados();

        System.out.println("****** DADOS DO CLIENTE ******");
        cliente.exibirDados();

        System.out.println("Aumentando o limite do cliente...");
        cliente.aumentarLimite(300);
        cliente.exibirDados();


    }
}
