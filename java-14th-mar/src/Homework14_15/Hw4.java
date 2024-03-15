package Homework14_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hw4 {
    public static void main(String[] args){
        Random random = new Random();
        String[] myList = {"apple", "banana", "cherry","date"};
        int index = random.nextInt(myList.length);
        System.out.println(myList[index]);

        }

    }

