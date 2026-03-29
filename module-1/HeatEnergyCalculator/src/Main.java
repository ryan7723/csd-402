// Ryan Barber Assignment 1.3 3/29/26

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of water in kilograms: ");
        double waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        double initialTemp = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        double finalTemp = input.nextDouble();

        double Q = waterMass * (finalTemp - initialTemp) * 4184;

        System.out.println("The energy needed is: " + Q + " Joules");

        input.close();
    }
}