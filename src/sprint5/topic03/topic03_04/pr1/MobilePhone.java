package sprint5.topic03.topic03_04.pr1;

public class MobilePhone extends Phone{

    public MobilePhone(String number) {
        super(number);

        final String messageText;
    }


    //объявите метод sendSms()
            public void sendSms() {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}