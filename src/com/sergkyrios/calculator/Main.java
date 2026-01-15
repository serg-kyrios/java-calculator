

package com.sergkyrios.calculator;
import com.sergkyrios.calculator.Calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.print("Введіть оператор (+, -, *, /) або exit: ");
            String operator = scanner.nextLine();

            if (operator.equals("exit")) {
                System.out.println("Вихід з програми.");
                break;
            }

            while (!operator.equals("+") && !operator.equals("-")
                    && !operator.equals("*") && !operator.equals("/")) {

                System.out.print("Невідомий оператор. Спробуйте ще раз: ");
                operator = scanner.nextLine();
            }

            double a = readInt(scanner, "Введіть перше число: ");
            double b = readInt(scanner, "Введіть друге число: ");

            if (operator.equals("/")) {
                while (b == 0) {
                    System.out.print("Ділення на нуль заборонено. Введіть інше число: ");
                    b = readInt(scanner, "");
                }
            }

            double result;

            switch (operator) {
                case "+" : result = Calculator.valueOf("ADD").apply(a, b);
                    break;
                case "-":
                    result =  result = Calculator.valueOf("SUBTRACT").apply(a, b);
                    break;
                case "*":
                    result =  result = Calculator.valueOf("MULTIPLY").apply(a, b);
                    break;
                case "/":
                    result =  result = Calculator.valueOf("DIVIDE").apply(a, b);
                    break;
                default:
                    continue;
            }

            System.out.println("Результат: " + result);
            System.out.println();
        }

        scanner.close();
    }

    // 🔹 Метод безпечного введення числа
    static double readInt(Scanner scanner, String message) {
        if (!message.isEmpty()) {
            System.out.print(message);
        }

        while (!scanner.hasNextInt()) {
            System.out.print("Це не число. Спробуйте ще раз: ");
            scanner.next();
        }

        double value = scanner.nextInt();
        scanner.nextLine(); // 🔥 важливо
        return value;
    }
}
