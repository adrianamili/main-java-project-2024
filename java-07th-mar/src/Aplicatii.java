import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;


public class Aplicatii {
    public static void main(String[] args){

        /**1*/
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YY HH:mm");
        String formatDateTime = localDateTime.format(formatter);
        System.out.println(formatDateTime);

        /**2*/
        localDateTime.plusHours(5).plusMinutes(30);
        String formatDateTimePlus = localDateTime.plusHours(5).plusMinutes(30).format(formatter);
        System.out.println(formatDateTimePlus);

        /**4*/
        LocalDateTime dateTimeGiven = LocalDateTime.of(2024,04,15,
                4,25,50);
        if (dateTimeGiven.isBefore(LocalDateTime.now())){
            System.out.println("Given date and time is before local date and time");
        }else if (dateTimeGiven.isAfter(LocalDateTime.now())){
            System.out.println("Given date and time is after local date and time");
        }

        /**3*/
        LocalDateTime localDateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm");
//        String formatDateTime2 = localDateTime2.format(formatter2);
//        System.out.println(formatDateTime2);
        System.out.println(localDateTime2.toLocalDate());
        System.out.println(localDateTime2.toLocalTime());

        /**5*/
        String dateTime = "2024-04-25 12:30";
        DateTimeFormatter formatterNew = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime1 = LocalDateTime.parse(dateTime,formatterNew);
        System.out.println(dateTime1);

        /**6*/
        Random random = new Random();
        random.nextInt();
        System.out.println(random.nextInt(1, 300));




    }
}
