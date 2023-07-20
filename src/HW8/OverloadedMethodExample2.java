package HW8;

public class OverloadedMethodExample2 {
    public static void printMessage(String message, int number) {
        System.out.println("Ваше сообщение - \"" + message + "\", ваше число - " + number + " ");
    }

    public static void printMessage(int number) {
        System.out.println("Ваше число - " + number + " ");
    }

    public static void printMessage(String message) {
        System.out.println("Ваше сообщение - \"" + message + "\"");
    }

    public static void main(String[] args) {
        String myMessage = "Hello, world";
        int myNumber = 39;

        printMessage(myMessage, myNumber);
        printMessage(myMessage);
        printMessage(myNumber);
    }
}