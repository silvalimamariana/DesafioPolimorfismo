package Banco;

public class ContaCorrente extends ContaBancaria {

    private double tarifaMensal;

    public void cobrarTarifaMensal(double tarifaMensal) {

        saldo -= tarifaMensal;
        System.out.println("A tarifa mensal de " + tarifaMensal + " foi aplicada e agora o novo saldo é " + saldo);

    }

}
