package pro1.Task5;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MyDateParser
{
    public static ZonedDateTime parse(String input) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.of("Europe/Prague"));
        ZonedDateTime dateTime = ZonedDateTime.parse(input, formatter);
        return  dateTime;
    }
}