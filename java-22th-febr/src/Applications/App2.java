package Applications;

import javax.swing.plaf.IconUIResource;
import java.sql.SQLOutput;
import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter a number:");
        int n = scanner.nextInt();
        int numerePare = 0;
        int numereImpare = 0;
//
        for (int x = 1; x <= n; ++x) {
            if (x % 2 == 0) ++numerePare;
            else ++numereImpare;
        }
        System.out.println("Counter pare: " + numerePare);
        System.out.println("Counter impare: " + numereImpare);
    }
}


