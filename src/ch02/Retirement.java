package ch02;

import java.util.Scanner;

public class Retirement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How much money do you want to retire?");
        double goal = in.nextDouble();
        System.out.println("How much money do you want to save every year?");
        double payment = in.nextDouble();
        System.out.println("Interest rate in %:");
        double rate = in.nextDouble();

        // the total money you have saved
        double balance;
        balance = 0;

        // the years of achieving the goal
        int year;
        year = 0;

        while (goal > balance) {
            balance = balance + payment;
            balance = balance * (100 + rate) / 100;
            year++;
            System.out.println("At the end of year " + year + ". You have " + balance + " HKD");
        }

        System.out.println("You need to save money for " + year + " years");
    }
}
