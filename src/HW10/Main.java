package HW10;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        Human mother = new Human("Jane", "Karleone", 1970);
        Human father = new Human("Vito", "Karleone", 1965);
        Family family = new Family(mother, father);
        Human child = new Human("Michael", "Karleone", 1990, 90, dog, mother, father, family);

        child.greetPet();
        child.describePet();
        System.out.println(child);
        System.out.println(family);

        Human child2 = new Human("Mary", "Karleone", 1995);
        family.addChild(child2);
        System.out.println(family);
        family.deleteChild(child2);
        System.out.println(family);
    }
}