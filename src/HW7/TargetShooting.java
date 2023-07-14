package HW7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TargetShooting {
    public static void main(String[] args) {
        char[][] gameField = new char[5][5];
        initializeGameField(gameField);

        System.out.println("All Set. Get ready to rumble!");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Введите номер строки (1-5): ");
            int row = scanner.nextInt();

            System.out.print("Введите номер столбца (1-5): ");
            int col = scanner.nextInt();

            if (isValidMove(row, col) && gameField[row - 1][col - 1] != '*') {
                gameField[row - 1][col - 1] = '*';

                if (gameField[row - 1][col - 1] == 'X') {
                    System.out.println("You have won!");
                    break;
                }

                printGameField(gameField);
            } else {
                System.out.println("Некорректный ход. Попробуйте снова.");
            }
        }
    }

    private static void initializeGameField(char[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            Arrays.fill(gameField[i], '-');
        }

        Random random = new Random();
        int targetRow = random.nextInt(5);
        int targetCol = random.nextInt(5);
        gameField[targetRow][targetCol] = 'X';

        printGameField(gameField);
    }

    private static void printGameField(char[][] gameField) {
        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                System.out.print(gameField[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isValidMove(int row, int col) {
        return row >= 1 && row <= 5 && col >= 1 && col <= 5;
    }
}