package sprint05.t33.topic03_03.pr1;

public abstract class Parallelogram implements Figure{
    protected double a;
    protected double h;
    public Parallelogram(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public abstract double getArea();
}