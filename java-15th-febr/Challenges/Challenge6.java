package Challenges;

public class Challenge6 {
    public static void main(String[] args) {


        int temperatura = 28;
        if (temperatura > 30) {
            System.out.println("Hot");
        } else if (20 < temperatura && temperatura < 30) {
            System.out.println("Warm");
        } else if (temperatura < 20) {
            System.out.println("Cold");
        }

    }
}
