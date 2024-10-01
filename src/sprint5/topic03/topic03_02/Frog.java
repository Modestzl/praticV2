package sprint5.topic03.topic03_02;

public class Frog extends Amphibian {

    protected Frog() {
        super("зеленая");
    }

    @Override
    public void move() {
        System.out.println("Я передвигаюсь по суше прыжками.");
    }

}