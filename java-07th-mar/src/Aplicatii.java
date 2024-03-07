import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Aplicatii {
    public static void main(String[] args){
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YY HH:mm");
        String formatDateTime = localDateTime.format(formatter);
        System.out.println(formatDateTime);



    }
}
