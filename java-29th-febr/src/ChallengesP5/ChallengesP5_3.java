package ChallengesP5;

import java.util.Arrays;

public class ChallengesP5_3 {

    public static void main(String[] args) {

        int[] myNum = {18, 24, -45, 21, -36, -27, 83, -11};
        for (int i : myNum) {
            if (i<0) {
                System.out.println(Arrays.stream(myNum).count());
            }
        }
    }
}
