package homework8;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, insert a number:");
        int number = scanner.nextInt();
        if (number > 0 ){
            System.out.println("Pozitive");}else {
            System.out.println("Non-positive");}

    }
}
