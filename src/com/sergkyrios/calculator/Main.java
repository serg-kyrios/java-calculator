

package com.sergkyrios.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть оператор (+ або -): ");
        String operator = scanner.nextLine();

        System.out.print("Введіть два числа через пробіл: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result;

        switch (operator) {
            case "+":
                result = Calculator.add(a, b);
                break;
            case "-":
                result = Calculator.subtract(a, b);
                break;
            default:
                System.out.println("Невідомий оператор");
                return;
        }

        System.out.println("Результат: " + result);
    }
}
