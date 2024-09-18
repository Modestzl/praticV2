package sprint5.topic03.topic03_02.pr1;

public class Fish extends Pet{


    protected Fish() {
        super("Я рыбка! Я молчалива");
    }
    @Override
    public void move() {
        System.out.println("я плыву.");
    }
}
