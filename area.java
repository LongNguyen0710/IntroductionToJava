package week1.day1.IntroductionToJava;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the width");
        width = scanner.nextFloat();
        System.out.println("Enter the height");
        height = scanner.nextFloat();
        float area= width * height;
        System.out.println(area);
    }
}
