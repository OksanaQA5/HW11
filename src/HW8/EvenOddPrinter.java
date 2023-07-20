package HW8;

public class EvenOddPrinter {
    public static void printEvenOddNumbers(int[] numbers) {
        System.out.println("Четные числа:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nНечетные числа:");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        printEvenOddNumbers(numbers);
    }
}