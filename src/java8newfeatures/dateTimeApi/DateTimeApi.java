package java8newfeatures.dateTimeApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Set;
import java.util.stream.Collectors;

public class DateTimeApi {
    /*
    Old Version
    1. Earlier version of Java first issue with Data Time Api is there were 2 packages java.util and java.sql with same class.
    2. Second issue was, we need to import java.text.* packages while working with date formatting.
    3. Third issue was Date Object wasn't thread safe. If multiple thread was working with Date object then there can be a problem.

    New Version Java 8
    1. Date Time is immutable. It will create a new object for you everytime you try to change it.
    2. We use different package(java.time.LocalDate) now so there is no confusion.
    */
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //This will print only the date.

        //Month is a ENUM not a class
        LocalDate localDate1 = LocalDate.of(1989, Month.APRIL,12);
        System.out.println(localDate1);
        /*LocalDate localDate2 = LocalDate.of(1989, Month.FEBRUARY,29); //This will throw an Exception now.
        System.out.println(localDate2);*/

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        //Get all the time Zone
        //Learn how to filter this set
        //ZoneId.getAvailableZoneIds().forEach(i-> System.out.println(i));
        Set<String> americanZones = ZoneId.getAvailableZoneIds().stream().filter(i -> i.contains("America")).collect(Collectors.toSet());
        System.out.println(americanZones);

        //Let's look some machine readable object
        Instant instant = Instant.now();
        System.out.println(instant);
    }
}
