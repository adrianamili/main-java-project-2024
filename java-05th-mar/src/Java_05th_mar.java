import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Java_05th_mar {
    public static void main(String[] args) {





        String denumireFirma = "Curs.Inc";
        denumireFirma = "Altadenumire.Inc";

        StringBuilder denumireContract = new StringBuilder("Contract studii");
        denumireContract.append(" de anul acesta");
        System.out.println(denumireContract);

        denumireContract.append("  " + 1);
        System.out.println(denumireContract);
        System.out.println(denumireContract.indexOf("c"));
        System.out.println(denumireContract.substring(0, 3));

        System.out.println(denumireContract.insert(1,"CUVANT_NOU"));
        System.out.println(denumireContract);

        System.out.println(denumireContract.deleteCharAt(3));
        System.out.println(denumireContract);
        System.out.println(denumireContract.reverse());
        System.out.println(denumireContract.toString());

        double sumaContract = 100.22; //Double
        System.out.println(sumaContract); //.toString()
        int sumaContractIntreg = 100; //Integer

        String sumaContractString = String.valueOf(sumaContract);
        System.out.println(sumaContractString);


        LocalDate dataCurenta = LocalDate.now();
        System.out.println(dataCurenta);
        LocalDateTime dataExacta = LocalDateTime.now();
        System.out.println(dataExacta);

        LocalDate dataDeIeri = LocalDate.of(2024,3,4);
        System.out.println(dataDeIeri);

        System.out.println(dataCurenta.minusDays(2));

        LocalDateTime dataExactaDeIeri = LocalDateTime.of(2024,3,4,14,23,47);
        System.out.println(dataExactaDeIeri);

        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YY HH:mm");
        String formatDateTime = dataExactaDeIeri.format(format);
        System.out.println(formatDateTime);


    }
}