package HW9;

public class Tree {
    String type;
    int height;
    int countOfSticks;
    String colour;

    public Tree(String type, int height) {
        this.type = type;
        this.height = height;
        this.countOfSticks = 13;
        this.colour = "Зеленый";
    }

    public Tree(int height, int countOfSticks, String colour) {
        this.type = "пихта";
        this.height = height;
        this.countOfSticks = countOfSticks;
        this.colour = colour;
    }

    public Tree() {
        this.height = 350;
        this.countOfSticks = 29;
        this.colour = "Желтый";
    }


    public Tree(String type) {
        this();
        this.type = type;
    }

}

