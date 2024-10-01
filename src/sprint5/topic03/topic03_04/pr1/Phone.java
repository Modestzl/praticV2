package sprint5.topic03.topic03_04.pr1;

public abstract class Phone {
    private final String number;
    public String targetNumber;
    public Phone(String number) {
        this.number = number;
    }
    public static void getPhone(int type, String number){};
    public void makeCall(String targetNumber) {
        System.out.println("Звоним с номера " + number);

        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    }

//    public void makeCall(String targetNumber) {
//    }
}