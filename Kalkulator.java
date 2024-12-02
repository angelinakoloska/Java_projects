package Prosjekt1_calculator;

import java.util.Scanner;

public class Kalkulator {
    double num1;
    double num2;
    String operation;
    double result;
    Scanner scanner = new Scanner(System.in);

    public void getUserInput() {
        System.out.println("Skriv inn det første tallet");
        num1 = scanner.nextDouble();

        System.out.println("Velg en operasjon (+, -, *, /");
        operation = scanner.next();

        System.out.println("Skriv inn det andre tallet");
        num2 = scanner.nextDouble();
    }

    public void calculate() {
        switch (operation) {
            case "+": {
                result = num1 + num2;
                break;
            }

            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Ugyldig operasjon!");
                return;
        }
    }

    public void displayResult() {
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result); ;
    }



    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();

        kalkulator.getUserInput();
        kalkulator.calculate();
        kalkulator.displayResult();
    }
}
