package com.company;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise12_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InputMismatch myObject = new InputMismatch();

        System.out.println("Enter two integers: ");
        int num1 = 0;
        int num2 = 0;
        try {
            num1 = input.nextInt();
            num2 = input.nextInt();
        } catch (InputMismatchException ex) {
            input.nextLine();
            System.out.println("Invalid input...");
        }
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + myObject.inputMismatchEx(num1, num2));

    }
}
