package homework8;

import java.util.Scanner;

public class Challenge17 {
    public static void main(String[] args) {

        boolean hasUsername = true;
        boolean hasPassword = false;

        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        } else if (hasUsername == false || hasPassword == false) {
            System.out.println("Authentication failed");
        } else if (hasUsername && hasPassword == false) {
            System.out.println("Password is incorrect");
        }

    }
}







