package sprint5.topic03.topic03_04.pr1;

public class MobilePhone extends Phone{

    private String messageText;

    public MobilePhone(String number) {
        super(number);

           }


    //объявите метод sendSms()
            public void sendSms(String targetNumber,String messageText) {
        System.out.println("Отправляем сообщение " + messageText + " по номеру " + targetNumber);
    }
}