package Challenges;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;



public class Challenge10 {
    public static void main(String[] args) {

        List<String> listOne = Arrays.asList("Apples","Strawberries","Bananas","Oranges");
        List<String> listTwo = new ArrayList<>(listOne);


        System.out.println(listOne);
        System.out.println(listTwo);

        listOne.add("Cranberries");
        listOne.add("Lemons");


    }
}
