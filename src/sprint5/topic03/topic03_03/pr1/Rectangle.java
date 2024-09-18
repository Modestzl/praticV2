package sprint5.topic03.topic03_03.pr1;

public class Rectangle extends Parallelogram {
    // Длины сторон прямоугольника
    private final double a;
    private final double b;

    public Rectangle(double a, double b) {
        super(a,b);
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }
}