

package com.sergkyrios.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть оператор (+ або -  , * , /): ");
        String operator = scanner.nextLine();

        System.out.print("Введіть два числа через пробіл: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result;

        while (b == 0) {
            System.out.print("Ділення на нуль неможливе. Введіть друге число ще раз: ");

        }
        while (a < 0 || b < 0) {
            System.out.print("Будь ласка, введіть додатні числа: ");
            a = scanner.nextInt();
            b = scanner.nextInt();
        }
        while (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")) {
            System.out.print("Невідомий оператор. Введіть оператор (+ або - , * , /): ");
            operator = scanner.nextLine();
        }
       while (operator.equals("exit")) {
            System.out.println("Вихід з програми.");
            return;
        }
        switch (operator) {
            case "+":
                result = Calculator.add(a, b);
                break;
            case "-":
                result = Calculator.subtract(a, b);
                break;
                case "*":
                result = Calculator.multiply(a, b);
                break;
                case "/":
                result = Calculator.divide(a, b);
                break;

            default:

                return;

        }

        System.out.println("Результат: " + result);
    }
}
