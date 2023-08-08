package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input your weight in KG : ");
        double weight = scanner.nextDouble();

        System.out.print("Please input your height in METRES: ");
        double height = scanner.nextDouble();

        double BMI = weight/height*height;
        System.out.println("Your Body Mass Index is: " +BMI);

        if (BMI > 25.0){
            System.out.println("you are Overweight");
        }else if (BMI >= 18.5 && BMI <= 24.9){
            System.out.println("You have a Normal weight");
        }else {
            System.out.println("You are Underweight");
        }

    }
}