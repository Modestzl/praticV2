package sprint5.topic03.topic03_03.pr1;

public class Rhombus extends Parallelogram{

//    protected Rhombus() {
//        super();
//    }

    // Длина стороны ромба
//    private final double a;
//    // Высота ромба
//    private final double h;

    public Rhombus(double a, double h) {
        super( a, h);
        this.a = a;
        this.h = h;
    }
      public double getArea() {
        return a * h;
    }
}