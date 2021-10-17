package ch02;

import java.util.Locale;
import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you want save every year?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in %: ");
        double interest = in.nextDouble();

        double balance = 0.0;

        int year = 0;
        String input;
        do {
            balance += payment;
            balance = balance * (100 + interest) / 100;
            year++;
            System.out.println("After year " + year + ". You have " + balance + " HKD");
            System.out.println("Do you want to retire? (Input 'y' or 'n')");
            input = in.next().toUpperCase();
            System.out.println(input);
        } while (input.equals("N"));
    }
}
