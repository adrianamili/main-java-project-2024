package homework6;
import java.util.Scanner;
public class Challenge10 {
    public static void main(String[] args){
        System.out.println("Nu rata reducerile la sneakersi!!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Pretul articolului dorit este: ");
        double pret = sc.nextDouble();
        System.out.println("Felicitari!La aceasta categorie de pret discount-ul dvs este de 30%!");
        double discount = 0.3 * pret;
        pret -= discount;

        System.out.println("Pretul final al articolului este de " + pret + "RON.");




    }
}
