package Homework10;


public class Homework2 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 1000) {
            System.out.println(i);
            i++;
            if (i == 10) {
                System.out.println("Indexul a atins valoarea 10");
            } else if (i == 100) {
                System.out.println("Indexul a atins valoarea 100");

            } else if (i == 900) {
                System.out.println("Indexul a atins valoarea 900");
            }
        }

        int x = 1;
        do {
            System.out.println(x);
            x++;
        }
        while (x <= 1000);



    }
}
