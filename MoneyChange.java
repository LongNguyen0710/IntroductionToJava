package week1.day1.IntroductionToJava;

import java.util.Scanner;

public class MoneyChange {
    public static void main(String[] args) {
        System.out.println("Enter the money(Dollar)");
        float VND;
        Scanner scanner = new Scanner(System.in);
        float USD = scanner.nextFloat();
        VND = 23000*USD;
        System.out.println(USD + " Dollar = " + VND + " Dong");
    }
}
