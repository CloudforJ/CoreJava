package ch03;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = in.nextLine();

        System.out.println("Please enter your age: ");
        int age = in.nextInt();

        System.out.println("Hello, " + name +". You will be " + (age + 1) + " years old next year!");
    }
}
