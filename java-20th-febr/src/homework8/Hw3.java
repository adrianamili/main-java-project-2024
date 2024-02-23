package homework8;


import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, insert three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));
        System.out.println("The largest number is: " + largest);
    }
}
