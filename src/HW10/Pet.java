package HW10;

import java.util.Arrays;

public class Pet {
        private String species;
        private String nickname;
        private int age;
        private int trickLevel;
        private String[] habits;

        public Pet(String species, String nickname) {
            this.species = species;
            this.nickname = nickname;
        }

        public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
            this.species = species;
            this.nickname = nickname;
            this.age = age;
            this.trickLevel = trickLevel;
            this.habits = habits;
        }

        public Pet() {
        }

        public void eat() {
            System.out.println("Я їм!");
        }

        public void respond() {
            System.out.println("Привіт, хазяїн. Я - " + nickname + ". Я скучив!");
        }

        public void foul() {
            System.out.println("Потрібно добре замести сліди...");
        }

        @Override
        public String toString() {
            return species + "{nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + Arrays.toString(habits) + "}";
        }

    public String getNickname() {

        public String toString() {
        String name;
        return "Human{name='" + name + "', surname='" + surname + "', year=" + year + ", iq=" + iq +
                ", mother=" + (mother != null ? mother.getName() : null) + " " + (mother != null ? mother.getSurname() : null) +
                ", father=" + (father != null ? father.getName() : null) + " " + (father != null ? father.getSurname() : null) +
                ", pet=" + pet + "}";
    }

    public String getTrickLevel() {
    }
}