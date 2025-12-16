/* Crie uma classe ContaBancaria com métodos para realizar operações bancárias como
depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente
que herda da classe ContaBancaria. Adicione um metodo específico para a subclasse,
como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente. */

package Banco;

public class ContaBancaria {

    double saldo;

    public void depositar(double valor) {

        saldo += valor;
        System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldo);

    }

    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Novo saldo: " + saldo);
        } else {
            System.out.println("Não foi possível realizar o saque");
        }

    }

    public void consultarSaldo() {

        System.out.println("Seu saldo é: " + saldo);

    }

}
