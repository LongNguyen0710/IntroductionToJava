package week1.day1.IntroductionToJava;

import java.util.Scanner;

public class HelloBill {
    public static void main(String[] args) {
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("I like you " + name);
    }
}
