package ch02;

import java.util.Scanner;

/**
 * @author Bowen
 */
public class LotteryOdds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers you need to draw?");
        int k = in.nextInt();
        System.out.println("What is the highest number you can draw");
        int n = in.nextInt();

        int lotteryOdds;
        lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
        }
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");
    }
}
