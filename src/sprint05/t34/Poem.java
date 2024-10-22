package sprint05.t34;

import java.util.ArrayList;

public class Poem {

    public static void main(String[] args) {
        ArrayList<String> prisonerLines = new ArrayList<>();
        prisonerLines.add("Сижу за решеткой в темнице сырой.");
        prisonerLines.add("Вскормленный в неволе орел молодой,");
        prisonerLines.add("Мой грустный товарищ, махая крылом,");
        prisonerLines.add("Кровавую пищу клюет под окном,");

        printPoem(prisonerLines);
    }

    static void printPoem (ArrayList<String> poemLines){
        for (String line:poemLines
             ) {
            System.out.println("\t" + line);
            
        }
    }
}
