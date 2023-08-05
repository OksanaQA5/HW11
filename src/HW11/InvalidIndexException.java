package HW11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class InvalidIndexException extends Exception {
    public InvalidIndexException(String message) {
        super(message);
    }
}

class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class ArrayDivisionMethod {
    public static void main(String[] args) {
        try {
            double result = performArrayDivision();
            System.out.println("Result: " + result);
        } catch (InvalidIndexException | DivisionByZeroException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static double performArrayDivision() throws InvalidIndexException, DivisionByZeroException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int arraySize = random.nextInt(30) + 1;
        int[] array = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(31);
        }

        System.out.println("Generated array: " + Arrays.toString(array));
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();

        if (index < 0 || index >= arraySize) {
            throw new InvalidIndexException("Invalid index input.");
        }

        if (array[0] == 0) {
            throw new DivisionByZeroException("Division by zero.");
        }

        return (double) array[index] / array[0];
    }
}
public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop("MyShop");
        shop.returnCost();
    }
}