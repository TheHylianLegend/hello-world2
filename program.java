import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class program {

    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String text = curDate.format(format);
        
        System.out.println("Here ye : important announcement");
        System.out.println("Hello world!");
        System.out.println("Todays date is " + text);
        System.out.println("Goodbye! :)");
    }
}
