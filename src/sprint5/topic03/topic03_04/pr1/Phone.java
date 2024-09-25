package sprint5.topic03.topic03_04.pr1;

public abstract class Phone {
    private final String number;
    private final String targetNumber;

    public Phone(String number) {
        this.number = number;
    }

    public final void makeCall() {
        System.out.println("Звоним с номера " + number);

        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }
}