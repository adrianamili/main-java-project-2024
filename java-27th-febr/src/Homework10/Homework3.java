package Homework10;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Va rugam introduceti un numar la alegere: ");
        int a = scanner.nextInt();
        int i;
        if (a > 100) {
            i = 1;
        } else {
            i = 2;
        } ;
        switch (i) {
            case 1:
                System.out.println("Felicitari, numarul introdus indeplineste criteriile!");
                break;
            case 2:
                System.out.println("  ");
                break;
            default:
                System.out.println("  ");
        }
    }
}
