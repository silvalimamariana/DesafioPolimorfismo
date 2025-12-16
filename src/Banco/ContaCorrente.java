package Banco;

public class TesteBanco extends ContaBancaria {

    private double tarifaMensal;

    public void cobrarTarifaMensal() {

        saldo -= tarifaMensal;
        System.out.println("A tarifa mensal de " + tarifaMensal + "foi aplicada e agora o novo saldo é " + saldo);

    }

}
