package HW8;

public class ConsolePrinter {
       public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessage(int number) {
        System.out.println("Number: " + number);
    }

    public void printMessage(double number) {
        System.out.println("Double: " + number);
    }

      public static void main(String[] args) {
        ConsolePrinter printer = new ConsolePrinter();

        printer.printMessage("Привет, это сообщение будет выведено на консоль!");

        printer.printMessage(42);

        printer.printMessage(3.14);
    }
}