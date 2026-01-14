

package com.sergkyrios.calculator;

import com.sergkyrios.calculator.Operations.Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введіть оператор (+, -, *, /) або exit: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Вихід з програми.");
                break;
            }

            // Знаходимо операцію за символом
            Operation operation = getOperation(input);
            if (operation == null) {
                System.out.println("Невідомий оператор. Спробуйте ще раз.");
                continue;
            }

            int a = readInt(scanner, "Введіть перше число: ");
            int b = readInt(scanner, "Введіть друге число: ");

            if (operation == Operation.DIVIDE && b == 0) {
                System.out.print("Ділення на нуль заборонено. Введіть інше число: ");
                b = readInt(scanner, "");
            }

            int result = calculate(a, b, operation);
            System.out.println("Результат: " + result + " " + operation.getSymbol() + "\n");
        }

        scanner.close();
    }

    // 🔍 Метод пошуку Operation за символом
    static Operation getOperation(String symbol) {
        for (Operation op : Operation.values()) {
            if (op.getSymbol().equals(symbol)) {
                return op;
            }
        }
        return null;
    }

    // 🔢 Виконання обчислень через Calculator
    static int calculate(int a, int b, Operation op) {
        return switch (op) {
            case ADD -> Calculator.add(a, b);
            case SUBTRACT -> Calculator.subtract(a, b);
            case MULTIPLY -> Calculator.multiply(a, b);
            case DIVIDE -> Calculator.divide(a, b);
        };
    }

    // 🔹 Метод безпечного введення числа (без змін)
    static int readInt(Scanner scanner, String message) {
        if (!message.isEmpty()) {
            System.out.print(message);
        }

        while (!scanner.hasNextInt()) {
            System.out.print("Це не число. Спробуйте ще раз: ");
            scanner.next();
        }

        int value = scanner.nextInt();
        scanner.nextLine(); // Очищення буфера
        return value;
    }
}
