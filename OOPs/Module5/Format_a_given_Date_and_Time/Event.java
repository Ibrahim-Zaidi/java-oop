package java_oop.OOPs.Module5.Format_a_given_Date_and_Time;// Event.java
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    // Step 1: Declare private variables for event name, dateTime, duration, and timezone
    // Hint: Use String for name, ZonedDateTime for dateTime, Duration for duration
    
    // Step 2: Create a constructor to initialize these variables
    // Hint: public Event(String name, ZonedDateTime dateTime, Duration duration)
    
    // Step 3: Create getter methods for each variable
    
    // Step 4: Create a method to format and display the event date using a specified pattern
    // Hint: Use DateTimeFormatter.ofPattern(pattern) and dateTime.format(formatter)
    
    // Step 5: Create a method to calculate time remaining until the event
    // Hint: Use Duration.between(ZonedDateTime.now(), dateTime)
    
    // Step 6: Create a method to convert the event time to a different timezone
    // Hint: Use dateTime.withZoneSameInstant(ZoneId.of(timezoneId))
}

