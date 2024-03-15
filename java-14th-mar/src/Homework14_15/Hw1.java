package Homework14_15;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hw1 {
    public static void main(String[] args){

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime currentDateTime = localDateTime.plusHours(5).plusMinutes(30);
        DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String newDateTime = formatDateTime.format(currentDateTime);
        System.out.println(newDateTime);




    }
}
