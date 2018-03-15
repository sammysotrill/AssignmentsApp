
import jdk.nashorn.internal.ir.Assignment;

import java.util.ArrayList;

public class Main {


    public enum day{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY

    }

    public enum course{
        CALC2,DATASTRUCTURES,WORLDCIVILIZATIONS,SPANISH
    }

    public enum category{
        HOMEWORK,QUIZ,TEST,PRESENTATION,FINAL_EXAM
    }

    public static void main(String[] args) {
        System.out.println("\nHello, Assignments App!\n");

        day favorite = day.SATURDAY;
        System.out.println("My favorite day is: " + favorite + "\n");

        // generate 2 random assignments

        Assignment assign1 = new Assignment( enum day,enum course, enum category)


    }

}

