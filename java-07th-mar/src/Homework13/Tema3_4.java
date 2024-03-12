package Homework13;

import java.time.LocalDate;

public class Tema3_4 {
    public static void main(String[] args){

        /** Tema3 */
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        /**Tema4*/
        LocalDate toBeDate = currentDate.plusDays(10);
        System.out.println(toBeDate);
    }
}
