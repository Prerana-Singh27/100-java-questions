// Arithmetic Exception Handling.........

package Exceptionhandling;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("WELCOME TO ARITHMETIC EXCEPTION HANDLING!!!!!!!");
        System.out.print("enter 1st number:");
        int num1 = input.nextInt();
        System.out.print("enter 2nd number:");
        int num2 = input.nextInt();
        try {
            int result = num1 / num2;
            System.out.printf("RESULT IS %d", result);
        } catch (ArithmeticException exception) {
            if (exception.getMessage().equals("/ by zero")) {
                System.out.println("DIVIDE BY ZERO OCCURED.");
            } else {
                throw exception;
            }
        }
    }
}

