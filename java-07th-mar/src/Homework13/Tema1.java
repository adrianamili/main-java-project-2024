package Homework13;

public class Tema1 {
    public static void main(String[] args) {

        String[] elemente = {"Andreea ", "este ", "la ", "munte."};
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < elemente.length; i++) {
            myString.append(elemente[i]);
        }
        String newString = myString.toString();
        System.out.println(newString);

    }
}
