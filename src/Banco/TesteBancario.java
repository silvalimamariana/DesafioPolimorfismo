package Banco;

public class TesteBancario {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.depositar(2000);
        conta.sacar(100);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(4000);
        contaCorrente.sacar(200);
        contaCorrente.cobrarTarifaMensal(200);

    }
}
