package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        char operator;
        Double number1, number2, result = null;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        try {
            System.out.println("Enter first number");
            number1 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error. no char");
            input.close();
            return;
        }

        try {
            System.out.println("Enter second number");
            number2 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error. no char");
            input.close();
            return;
        }
        if (number1 != null && number2 != null) {
            switch (operator) {

                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                case '/':
                    if (number2 == 0) {
                        System.out.println("Error: cannot divide by 0");
                    } else {
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
        input.close();
    }
}
