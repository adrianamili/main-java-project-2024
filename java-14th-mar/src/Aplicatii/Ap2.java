package Aplicatii;

import java.util.ArrayList;

public class Ap2 {
    public static void main(String[] args) {
//      -Remove the third element from an ArrayList.

        ArrayList<String> numeCopii = new ArrayList<>();
        numeCopii.add("Matei");
        numeCopii.add("Andreea");
        numeCopii.add("Daiana");
        numeCopii.add("Denis");
        numeCopii.remove(2);

        for (String copii : numeCopii){
            System.out.println(copii);
        }

//        -Check if an ArrayList contains the element "Grape".
        System.out.println(numeCopii.contains("Grape"));

//        -Clear all elements from an ArrayList.
        numeCopii.remove("Matei");
        numeCopii.remove("Andreea");
        numeCopii.remove("Denis");

        System.out.println(numeCopii.isEmpty());

    }

}
