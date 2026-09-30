import java.time.*;
import java.time.format.DateTimeFormatter;  


public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate date =LocalDate.now();
        LocalDate yesterday =date.minusDays(1);
        LocalDate tomorrow =date.plusDays(1);
        LocalDateTime t =date.atTime(8,47,9);

        //Program to demonstrate isLeapYear() method of LocalDate Class.
        LocalDate date1 = LocalDate.of(2017, 4, 14);
        System.out.println(date1.isLeapYear());
        LocalDate date2 = LocalDate.of(2016, 9, 23);
        System.out.println(date2.isLeapYear());

        // Converting LocalDate to String
        LocalDate d1 = LocalDate.now();
        String d1Str = d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date1 in string :  " + d1Str);

        //Program to demonstrate parse() method 
        String dInStr = "2011-09-01";  
        LocalDate d = LocalDate.parse(dInStr);  
        System.out.println("String to LocalDate : " + d);  

        System.out.println("Today "+date);
        System.out.println("Yesterday "+yesterday);
        System.out.println("Tomorrow "+tomorrow);
        System.out.println("Time "+t);
    }
}
