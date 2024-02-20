package Challenges;

public class Challenge7 {
    public static void main(String[] args) {

        int sideOne = 12;
        int sideTwo = 14;
        int sideThree = 17;
        String triangleType = sideOne == sideTwo && sideOne == sideThree ? "Equilateral"
                : (sideOne != sideTwo && sideThree == sideTwo) ? "Isoscel" : "Scalene";
        System.out.println(triangleType);
    }
}
