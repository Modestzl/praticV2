package sprint05.t33.topic03_02.pr1;

public class Practicum {

    public static void main(String[] args) {
        Cat cat = new Cat();
        //System.out.println(cat .giveVoice());
        cat.catchMouse();
        cat.giveVoice();

        Dog dog = new Dog();
        dog.bringStick();
        dog.play();

        Hamster hamster = new Hamster();
        hamster.hideFood();
        hamster.sleep();
        hamster.move();

        Fish fish = new Fish();
        fish.sleep();

        Spider spider = new Spider();
        System.out.println("У паука " + spider.getPawsCount() + " лапок.");
    }

}