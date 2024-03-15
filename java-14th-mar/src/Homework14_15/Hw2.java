package Homework14_15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Hw2 {
    public static void main(String[] args){

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime  = LocalTime.now();
        System.out.println(localDate);
        System.out.println(localTime);

    }
}
