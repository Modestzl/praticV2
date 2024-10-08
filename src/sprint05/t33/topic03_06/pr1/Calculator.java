package sprint05.t33.topic03_06.pr1;
import java.util.List;

public class Calculator {

    private Calculator() {}
    //static double count = 0;
    public static double calculate(List<MediaItem> mediaItems) {
        double count = 0;
        for (MediaItem item:mediaItems
             ) {
            if (item instanceof Movie){
                count += item.getRuntime();
                //count +=1024;
            }
            else
            if (item instanceof Series){
                count += item.getRuntime() * ((Series) item).getSeriesCount();
            }

        }



        return count;
    }

}

//    public double getTotalCost() {
//        double total = 0;
//        for (ItemPrice ip : itemlist) {
//            total += ip.getCost();
//        }
//        return total;
//    }
//mediaItem instanceof Movie
//mediaItem instanceof Series
//        double daysWatch() {
//            double maxExpense = 0;
//            for (Double exp : expenses) {
//                if (exp.getValue() > maxExpense) {
//                    maxExpense = exp.getValue();
//                }
//            }
//            return maxExpense;
//        }

// Напишите реализацию метода, который будет возвращать общее количество дней,
// потраченных на просмотр фильмов и сериалов