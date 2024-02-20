package homework6;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti doua numere intregi la alegere:");
        System.out.println("Primul numar:");
        int a = sc.nextInt();
        System.out.println("Al doilea numar:");
        int b = sc.nextInt();

        if(a>b) {
            System.out.println("Numarul " + a + " este mai mare decat numarul " + b);
        } else if (a<b) {
            System.out.println("Numarul " + a + " este mai mic decat numarul " + b);
        } else if (a==b) {
            System.out.println("Cele doua numere sunt egale");}

        }

    }

