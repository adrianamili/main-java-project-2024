package homework7;

import java.util.Scanner;

public class Tema4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Va rugam sa introduceti un numar la alegere: ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println("Negativ");
        } else if (a > 0) {
            System.out.println("Pozitiv");
        } else if (a == 0){
            System.out.println("0");}

    }
}

