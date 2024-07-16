package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

class Calculator {
    private Double number1;
    private Double number2;
    private char operator;

    public void inputData() {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        try {
            System.out.println("Enter first number");
            number1 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input for the first number");
            input.close();
            return;
        }

        try {
            System.out.println("Enter second number");
            number2 = input.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input for the second number");
            input.close();
            return;
        }

        input.close();
    }

    public void calculate() {
        if (number1 != null && number2 != null) {
            switch (operator) {
                case '+':
                    add();
                    break;
                case '-':
                    subtract();
                    break;
                case '*':
                    multiply();
                    break;
                case '/':
                    divide();
                    break;
                default:
                    System.out.println("Invalid operator!");
                    break;
            }
        } else {
            System.out.println("Invalid input");
        }
    }

    private void add() {
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }

    private void subtract() {
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
    }

    private void multiply() {
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));
    }

    private void divide() {
        if (number2 == 0) {
            System.out.println("Error: cannot divide by 0");
        } else {
            System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));
        }
    }
}
