import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {


        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YY HH:mm");
        String formatDateTime = now.format(format);
        System.out.println(formatDateTime);
    }
}