//Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos().
// Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
// Adicione um metodo específico para cada uma das subclasses, como verificarSeEhPrimo()
// para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

package NumeroPrimo;

public class NumerosPrimos {


    public boolean verificarPrimalidade(int numero) {

        if(numero <= 1) { //numeros negativos ou igual a zero nao sao primos
            return false;
        }

        for(int i = 2; i * i <= numero; i++) {

            /* i como sendo um possivel divisor ele começa em 2 porque todos os numeros sao divisiveis por um
            o possivel divisor vai dividir ate a raiz do numero, depois disso nao precisa mais por nao ser possivel
            entao o divisor vai aumentando a cada repeticao */

            if (numero % i == 0) { //se o numero dividido tiver o resto igual a zero ele nao é primo
                return false;
            }
        }
        return true; //se nada foi dividido entao é primo

    }

    public void listarPrimos(int limiteSuperior) {

        System.out.println("Números primos até " + limiteSuperior + ": ");

        for (int i = 2; i <= limiteSuperior ; i++) { //inicio em 2 e vai ate o limite
            if (verificarPrimalidade(i)) {
                System.out.println(i + " ");
            }

        }
        System.out.println();
    }

}
