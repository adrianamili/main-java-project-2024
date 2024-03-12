package Homework13.Tema2;
import java.lang.reflect.Array;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Tema2 {
    public static void main(String[] args){


        Student student = new Student("Popescu Andrei", "20");
        String[] getArray = {student.getAge(), student.getName()};
        for (int i =0; i<getArray.length;i++){
            String x = (String) Array.get(getArray,i);
            System.out.println(x);
        }
    }
}
