package Banco;

public class ContaCorrente {

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria();

        conta.consultarSaldo();
        conta.depositar(200);
        conta.sacar(100);
        conta.cobrarTarifaMensal();


    }
}
