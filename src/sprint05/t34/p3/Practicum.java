package sprint05.t34.p3;

public class Practicum {

    public static void main(String[] args) {
        // Тип сохраняемых значений должен быть Integer
        Pair pair = new Pair(4, 1);
        System.out.println("Координаты игрока на карте:");
        pair.print();
        // исправьте код, чтобы значения сохранялись корректно
        Integer x = (Integer)pair.getValue1();
        Integer y = (Integer)pair.getValue2();

        System.out.println();

        //тип сохраняемых значений должен быть String
        Pair stringPair = new Pair("username", "1");
        System.out.println("Чит-код пользователя:");
        stringPair.print();
        // исправьте код, чтобы значения сохранялись корректно
        String user = (String)stringPair.getValue1();
        String cheatCode = (String) stringPair.getValue2();
    }
}

class Pair {
    public final Object value1;
    public final Object value2;

    public Pair(Object value1, Object value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void print() {
        System.out.printf("(%s, %s)", value1, value2);
    }

    public Object getValue1() {
        return value1;
    }

    public Object getValue2() {
        return value2;
    }
}
