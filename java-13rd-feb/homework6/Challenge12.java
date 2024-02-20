package homework6;
import java.util.Scanner;
public class Challenge12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduceti orice numar intreg doriti:");
        int a = sc.nextInt();
        if (a > 0 && a < 100) {
            System.out.println("Numarul introdus indeplineste criteriile.");
        }else {
            System.out.println("Din pacate,numarul dvs nu indeplineste criteriile.");
        }
        }
    }
