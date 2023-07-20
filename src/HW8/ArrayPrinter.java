package HW8;

public class ArrayPrinter {
    public static void printArray(String... arr) {
        if (arr != null && arr.length > 0) {
            for (String str : arr) {
                System.out.print(str + " ");
            }
            System.out.println();
        } else {
            System.out.println("Массив пустой или равен null");
        }
    }

    public static void main(String[] args) {
        String[] arr1 = {"Java", "перегрузка", "методов"};
        String[] arr2 = {"Hello", "world!"};

        printArray(arr1);

        printArray(arr2);

        printArray("Перегрузка", "методов", "в", "Java");
    }
}