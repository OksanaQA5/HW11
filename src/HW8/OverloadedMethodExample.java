package HW8;

public class OverloadedMethodExample {
    public void printMessage() {
        System.out.println("Я пустой");
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        OverloadedMethodExample example = new OverloadedMethodExample();
        example.printMessage();
}
}