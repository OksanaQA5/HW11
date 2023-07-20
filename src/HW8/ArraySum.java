package HW8;

public class ArraySum {
    public static void printArraySum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void printArraySum(double[] arr) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        System.out.println("Сумма элементов массива: " + sum);
    }

    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};

        printArraySum(intArray);
        printArraySum(doubleArray);
    }
}