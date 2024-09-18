package sprint5.topic03.topic03_02.pr1;

public class Cat extends Pet{
    protected Cat() {
        super("Я кошка! Я мяукую.");
    }
    @Override
    public void move() {
        System.out.println("Я передвигаюсь по суше прыжками.");
    }
public void catchMouse(){
    System.out.println("Поймала мышку!");
}
//@Override
public void giveVoice(){
    System.out.println("Мяу!");
}

}
