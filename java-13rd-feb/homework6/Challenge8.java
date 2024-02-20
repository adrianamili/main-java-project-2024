package homework6;
import java.util.Scanner;

public class Challenge8 {
    public static void main(String[] args) {

        System.out.println("Input User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti un numar intreg de la 0 la 10: ");
        int a = sc.nextInt();
        System.out.println(--a);
        System.out.println(a);
        System.out.println(++a);


    }
}
