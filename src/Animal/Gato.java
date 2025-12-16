package Animal;

public class Gato extends Animal{

    public void arranharMoveis() {

        System.out.println("Os móveis estão sendo arranhados!");

    }

    @Override
    public void emitirSom() {
        System.out.println("Miau miau");
    }
}
