import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> numeMasini = new ArrayList<>();
        numeMasini.add("Masina 1");
        numeMasini.add("Masina 2");
        numeMasini.add("Masina 3");

        for (String numeMasina : numeMasini) {
            System.out.println(numeMasina);
        }

        System.out.println(numeMasini.get(1));

        System.out.println(numeMasini.size());

        System.out.println("ArrayList are elemente?" + !numeMasini.isEmpty());

        numeMasini.remove("Masina 1");

        for (String numeMasina : numeMasini) {
            System.out.println(numeMasina);
        }

        System.out.println("Skoda este elemente?" + numeMasini.contains("Skoda"));

        LinkedList<String> numeOrase = new LinkedList<>();
        numeOrase.add("Oras 1");
        numeOrase.add("Oras 2");
        numeOrase.add("Oras 3");

        for (String numeOras : numeOrase){
            System.out.println(numeOras);
        }


    }
}