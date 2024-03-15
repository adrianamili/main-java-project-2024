package Aplicatii;

import java.util.ArrayList;

public class Ap3 {
    public static void main(String[] args){
//        -Print each element of an ArrayList using a for-loop.

        ArrayList<String> fructe = new ArrayList<>();
        fructe.add("mere");
        fructe.add("pere");
        fructe.add("prune");
        fructe.add("banane");
        for (String fructisoare :fructe){
            System.out.println(fructisoare);
        }

//-Insert the value "Mango" into the second position of an ArrayList.
        fructe.add(1,"mango");

        for (String fructe2 :fructe){
            System.out.println(fructe2);
        }

//        -Replace the first element of an ArrayList with the value "Penguin".

            fructe.remove(0);
            fructe.add(0,"penguin");
            for (String fructe3 : fructe){
                System.out.println(fructe3);
            }

    }

}
