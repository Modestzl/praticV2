package sprint5.topic03.topic03_04.pr1;

// допишите реализацию класса Smartphone
public class Smartphone extends Phone{


    public Smartphone(String number) {
        super(number);
    }
            // объявите метод sendEmail()
            public void sendEmail() {
        System.out.println("Напишем другу сообщение " + messageText + " по email " + email);
    }

}