package Animal;

public class Cachorro extends Animal {

    public void abanarRabo () {
        System.out.println("O rabo está sendo abanado!");

    }

    @Override
    public void emitirSom() {
        System.out.println("Au au");
    }
}
