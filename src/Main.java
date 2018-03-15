
import java.util.ArrayList;

public class Main {


    public enum day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

    }

    public enum courses{
        CALC2,DATASTRUCTURES,WORLDCIVILIZATIONS,SPANISH
    }

    public enum category{
        HOMEWORK,QUIZ,TEST,PRESENTATION,FINAL_EXAM
    }

    public static void main(String[] args) {
        System.out.println("\nHello, Assignments App!\n");

        day favorite = day.SATURDAY;
        System.out.println("My favorite day is: " + favorite + "\n");

        // Assing courses to days
        /*courses nineAM = courses.WORLDCIVILIZATIONS;
        courses tenAM = courses.DATASTRUCTURES;
        courses twelvePM = courses.CALC2;*/
        ArrayList<courses> initialize = MWFClasses(courses.WORLDCIVILIZATIONS,courses.DATASTRUCTURES,courses.CALC2);
        System.out.println("I have these classes on Mondays, Wednesdays, and Fridays: " + initialize);




    }

    public static ArrayList<courses> MWFClasses( courses worldcivilizations, courses datastructures, courses calc2){
        ArrayList<courses> answer = new ArrayList<courses>();
        answer.add(worldcivilizations,datastructures,calc2);


        return answer;
    }

}

