package sprint5.topic03.topic03_02.pr1;

public class Hamster extends Pet{
    protected Hamster() {
        super("Я хомяк! Я пискля.");
    }
    @Override
    public void move() {
        System.out.println("Я перекатываюсь.");
    }

    public void hideFood(){
        System.out.println("Вся еда — в щёчках!");
    }

}
