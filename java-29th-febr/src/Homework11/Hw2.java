package Homework11;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a preferential number:");
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}

