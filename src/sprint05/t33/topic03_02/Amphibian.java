package sprint05.t33.topic03_02;

public abstract class Amphibian {
    public String color;

    protected Amphibian(String color) {
        this.color = color;
    }

    public abstract void move();

    public String getColor(){
        return color;
    }

    public void eat() {
        System.out.println("Кушаю насекомых");
    }

}