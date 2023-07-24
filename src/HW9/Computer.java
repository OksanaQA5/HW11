package HW9;

import java.util.Objects;

class Computer {
    private String brand;
    private int price;
    private int ram;
    private int graphicsCard;

    public Computer(String brand, int price, int ram, int graphicsCard) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
        this.graphicsCard = graphicsCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(int graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Создан PC.\n" +
                "Имя = " + brand + ".\n" +
                "Цена = " + price + ".\n" +
                "Видеокарта = " + graphicsCard + ".\n" +
                "ОЗУ = " + ram + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return ram == computer.ram &&
                graphicsCard == computer.graphicsCard &&
                Objects.equals(brand, computer.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, graphicsCard);
    }

    public static class Main {
              public static void main(String[] args) {
                  Computer computer = new Computer("Lenovo", 1000, 16, 4);

                  System.out.println(computer);
            }
        }
}