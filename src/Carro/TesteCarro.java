package Carro;

public class TesteCarro {

    public static void main(String[] args) {

        ModeloCarro meuCarro = new ModeloCarro();

        meuCarro.definirModelo("Corsa");
        meuCarro.definirPreco(30000, 32000, 50000);
        meuCarro.exibirInformacoes();

    }

}
