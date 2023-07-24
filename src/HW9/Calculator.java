package HW9;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.start();
    }

    public void start() {
        System.out.println("Калькулятор запущен. Введите действие (например, 2+4) или введите 'Stop' для выхода.");

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("Stop")) {
                System.out.println("Калькулятор закрыт.");
                break;
            }

            if (isValidSyntax(input)) {
                double result = performAction(input);
                System.out.println("Результат: " + result);
            } else {
                System.out.println("Введите корректное действие.");
            }
        }
        scanner.close();
    }

    private boolean isValidSyntax(String input) {
        return input.matches("^\\d+\\.?\\d*[+\\-*/]\\d+\\.?\\d*$");
    }

    private double performAction(String input) {
        double result = 0.0;

        try {
            String[] parts = input.split("[+\\-*/]");

            double num1 = Double.parseDouble(parts[0]);
            double num2 = Double.parseDouble(parts[1]);

            char operator = input.charAt(parts[0].length());

            switch (operator) {
                case '+':
                    result = sum(num1, num2);
                    break;
                case '-':
                    result = minus(num1, num2);
                    break;
                case '*':
                    result = multiply(num1, num2);
                    break;
                case '/':
                    result = division(num1, num2);
                    break;
            }
        } catch (NumberFormatException | ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Ошибка выполнения действия: " + e.getMessage());
        }

        return result;
    }

    private double sum(double a, double b) {
        return a + b;
    }

    private double minus(double a, double b) {
        return a - b;
    }

    private double multiply(double a, double b) {
        return a * b;
    }

    private double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо");
        }
        return a / b;
    }
}