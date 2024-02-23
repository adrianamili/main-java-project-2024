package homework8;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, insert a number:");
        int number = scanner.nextInt();
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else if (number == 0 ) {
            System.out.println("Zero");}

        }
    }

