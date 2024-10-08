package sprint05.t33.topic03_02.pr1;

public class Spider extends Pet{
    protected Spider() {
        super("Я паук! Ну вы поняли.");
    }
    @Override
    public void move() {
        System.out.println("Я крадусь.");
    }
    public int getPawsCount(){
        return 8;
    }
}
