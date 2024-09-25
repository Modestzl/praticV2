package sprint5.topic03.topic03_04.pr1;

public class LandlinePhone extends Phone {

    public LandlinePhone(String number) {
        super(number);
    }


    public void makeCall(String targetNumber){
        System.out.println("Стационарный");
    };
}
