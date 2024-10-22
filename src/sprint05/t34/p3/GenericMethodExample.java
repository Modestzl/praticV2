package sprint05.t34.p3;

import java.util.ArrayList;

public class GenericMethodExample {

//    //метод возвращает значение типа T
public static void main(String[] args) {
    String name = null;
    String nameOrDefault =ifNull(name, "Unknown");
    System.out.println(nameOrDefault);

    Integer numberOrDefault =ifNull(4, 1);
    System.out.println(numberOrDefault);
}

    //метод возвращает значение типа T
    public static <T> T ifNull(T value, T defaultValue) {
        return value == null? defaultValue : value;
    }

}
