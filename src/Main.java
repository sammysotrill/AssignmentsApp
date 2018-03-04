import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

    public static void main(String[] args) {

        System.out.println("\n\nHello, AssignmentsApp!\n");
        // Output the current date-time
        LocalDateTime today = LocalDateTime.now();
        System.out.println("Today's date and time is: " + today);

        //Output tomorrow's date using a formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss");
        String formatDateTime = today.format(formatter);
        System.out.println("\n" + "The newly formatted date and time: " + formatDateTime);

        //Add five weeks to today's LocalDateTime
        LocalDateTime fiveWeeksLater = addFiveWeeks(today);
        System.out.println("\n" + "Five weeks later....." + fiveWeeksLater);

        //Initialize a LocalDateTime object to your birthdate and the time 12:35pm
        LocalDateTime bornDayWithTime = birthDateTime(2,19,1998);
        System.out.println("\n" + "My born day along with a given time: " + bornDayWithTime);

        //Output the day of the week (Sunday-Saturday) that you were born
        System.out.println( "\n" + "The exact day that I was born: " + bornDayWithTime.getDayOfWeek() );




    }

    private static LocalDateTime birthDateTime(int month, int day, int year) {
        LocalDateTime answer = LocalDateTime.of(year,month,day,12,35);

        return answer;

    }

    private static LocalDateTime addFiveWeeks(LocalDateTime date) {
        LocalDateTime answer  = date.plusWeeks(5);

        return answer;

    }

}

