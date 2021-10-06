package week1.day1.IntroductionToJava;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bmi;
        System.out.println("Enter the weight(kg)");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height(m)");
        double height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        if (bmi < 18) {
            System.out.print(bmi + " Underweight");
        } else if (bmi < 25.0) {
            System.out.print(bmi + " Nomarl");
        } else if (bmi < 30.0) {
            System.out.print(bmi + " Overweight");
        } else {
            System.out.print(bmi + " Obese");
        }
    }
}
//import java.util.Scanner;
//
//public class BMI {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double weight, height, bmi;
//
//        System.out.print("Your weight (in kilogram):");
//        weight = scanner.nextDouble();
//
//        System.out.print("Your height (in meter):");
//        height = scanner.nextDouble();
//
//        bmi = weight / Math.pow(height, 2);
//
//        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
//
//        if (bmi < 18)
//            System.out.printf("%-20.2f%s", bmi, "Underweight");
//        else if (bmi < 25.0)
//            System.out.printf("%-20.2f%s", bmi, "Normal");
//        else if (bmi < 30.0)
//            System.out.printf("%-20.2f%s", bmi, "Overweight");
//        else
//            System.out.printf("%-20.2f%s", bmi, "Obese");
//    }
//}