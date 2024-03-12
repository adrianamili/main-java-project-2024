import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        random.nextInt();
        System.out.println(random.nextInt(1, 100));

        Scanner scanner = new Scanner(System.in);


//        int numarUtilizator = 0;
//        while (numarUtilizator != 10) {
//            numarUtilizator = scanner.nextInt();
//            System.out.println("Este nevoie de un numar mai mic decat 10");
//        }
//        System.out.println("Numarul primit este: " + numarUtilizator);


        /** Math */

        int numarulMaxim = Math.max(1, 30);
        System.out.println(numarulMaxim);


        /** Array */

        int[] arrayNou = new int[]{10,20,30};
        System.out.println(arrayNou.length);

        String[] listaDeFructe = {"Mar", "Para","Banana"};
        System.out.println(listaDeFructe[2]);
        int[][] numarElementeMatrice = {{1,2},{3,4},{5,6}};
//        System.out.println(numarElementeMatrice[0][0]);
//        System.out.println(numarElementeMatrice);


        /** Pentru parcurgerea unui array */
        for (int index = 0; index < listaDeFructe.length; index++){
            System.out.println(listaDeFructe[index]);
        }

        for (String fruct:listaDeFructe){
            System.out.println(fruct + " FOR");

        }
        String[] listaCopiataFructe = Arrays.copyOfRange(listaDeFructe,0,1);
        for (String fructCopiat : listaCopiataFructe){
            System.out.println(fructCopiat);
        }
     String variabilaNull = null; //!=" "

        Arrays.sort(listaDeFructe);
        for (String fruct :listaDeFructe){
            System.out.println(fruct);
        }

    }
}