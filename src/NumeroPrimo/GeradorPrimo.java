package NumeroPrimo;

public class GeradorPrimo extends NumerosPrimos{

        public int gerarProximoPrimo(int ultimoPrimoConhecido) {

            int proximoNumero = ultimoPrimoConhecido + 1; //enquanto nao for primo soma mais 1, quando for um, retorna
            while (!verificarPrimalidade(proximoNumero)) {
                proximoNumero++;
            }
            return proximoNumero;
        }

}
