package HW7;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class maxValuesArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество строк: ");
        int rows = scanner.nextInt();

        System.out.print("Введите количество столбцов: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = random.nextInt(1001); // случайное число от 0 до 1000
            }
        }

        int[] maxValuesArray = new int[rows];
        for (int i = 0; i < rows; i++) {
            int max = array[i][0];
            for (int j = 1; j < cols; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
            maxValuesArray[i] = max;
        }

        System.out.println("Массив с максимальными значениями:");
        System.out.println(Arrays.toString(maxValuesArray));
    }
}