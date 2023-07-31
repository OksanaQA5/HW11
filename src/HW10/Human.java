package HW10;

public class Human {
    private String name;
    private String surname;
    private int year;
    private int iq;
    private Pet pet;
    private Human mother;
    private Human father;
    private Family family;

    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, Family family) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.family = family;
    }

    public Human() {
    }

    public void greetPet() {
        System.out.println("Привіт, " + pet.getNickname());
    }

    public void describePet() {
        String trickLevelDescription = (pet.getTrickLevel() > 50) ? "дуже хитрий" : "майже не хитрий";
        System.out.println("У мене є " + pet.getSpecies() + ", їй " + pet.getAge() + " років, він " + trickLevelDescription);
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.getName() : null) + " " + (mother != null ? mother.getSurname() : null) +
                ", father=" + (father != null ? father.getName() : null) + " " + (father != null ? father.getSurname() : null) +
                ", pet=" + pet + "}";
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}