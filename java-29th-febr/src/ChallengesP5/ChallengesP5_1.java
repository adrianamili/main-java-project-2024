package ChallengesP5;

import java.util.Scanner;

public class ChallengesP5_1 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer number:");
        int n = scanner.nextInt();
        if (n%2==0){
            System.out.println("Even");}else {
            System.out.println("Odd");}
    }
}
