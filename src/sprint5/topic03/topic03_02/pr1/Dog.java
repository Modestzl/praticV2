package sprint5.topic03.topic03_02.pr1;

public class Dog extends Pet{
    protected Dog() {
        super("Я собака! Я лаю.");
    }
    @Override
    public void move() {
        System.out.println("Я бегаю.");
    }
    public void bringStick (){
        System.out.println("Принёс палочку, как хороший мальчик!");
    }
}
