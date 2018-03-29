import java.lang.reflect.Array;
import java.time.LocalDateTime;
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
        Assignment assign1 = new Assignment();
        System.out.println("What is the first assignment? " + assign1 + "\n");
        Assignment assign2 = new Assignment(LocalDateTime.now(),2);
        System.out.println("What is the second assignment?" + assign2 + "\n");

        // copy assignment 1 to assignment three
        Assignment assign3 = assign1.copy();
        System.out.println("What is the third assignment? " + assign3 + "\n");

        //override an assignments.equals() method
        //Assignment compare = assign1.compareTo(assign2);
        //System.out.println(compare);

        // which of the assignments is the earliest?




    }



    }



