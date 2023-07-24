package HW9;

public class Main {
    public static void main(String[] args) {
        // Используем различные конструкторы для создания объектов Tree
        Tree tree1 = new Tree("Ель", 200);
        Tree tree2 = new Tree(250, 20, "Красный");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Дуб");

        // Можно обращаться к полям объектов и использовать их
        System.out.println("Дерево 1: " + tree1.type + ", высота: " + tree1.height + ", веток: " + tree1.countOfSticks + ", цвет: " + tree1.colour);
        System.out.println("Дерево 2: " + tree2.type + ", высота: " + tree2.height + ", веток: " + tree2.countOfSticks + ", цвет: " + tree2.colour);
        System.out.println("Дерево 3: " + tree3.type + ", высота: " + tree3.height + ", веток: " + tree3.countOfSticks + ", цвет: " + tree3.colour);
        System.out.println("Дерево 4: " + tree4.type + ", высота: " + tree4.height + ", веток: " + tree4.countOfSticks + ", цвет: " + tree4.colour);
    }
}