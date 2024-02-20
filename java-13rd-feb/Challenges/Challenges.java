package Challenges;

import java.util.Scanner;

public class Challenges {

    public static void main(String[] args) {


        //Challenge 6
        Scanner ns = new  Scanner(System.in);
        boolean a, b;
        System.out.println("Dati o valoare lui a (true/false):");
        a = ns.nextBoolean();
        System.out.println("Dati o valoare lui b (true/false):");
        b = ns.nextBoolean();

        System.out.println("Valoare !a: " + !a);
        System.out.println("Valoare !b: " + !b);




//        Scanner q = new Scanner(System.in);
//        System.out.println("Introduceti o valoare intre 1 si 10:");
//        int x = q.nextInt();
//        if (x < 0 || x > 10) {
//            System.out.println("Valoarea introdusa nu este corecta!");
//        } else {
//            System.out.println(x);
//            while (x < 10) }
//                x = --x;
//                System.out.println(x);

        }


    }
