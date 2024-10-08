package sprint05.t33.topic03_04.pr1;

// допишите реализацию класса Smartphone
public class Smartphone extends MobilePhone{


    private String messageText;
    private String email;

    public Smartphone(String number) {
        super(number);
    }

    public void makeCall(String targetNumber, String appName){
        System.out.println("Звоним с номера " + appName);

        System.out.println("Набираем номер " + targetNumber + " и звоним по сотовой связи");
        System.out.println("Привет!");
    };
            // объявите метод sendEmail()
            public void sendEmail(String email,String messageText) {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}