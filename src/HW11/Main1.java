package HW11;

import java.util.function.Consumer;

class Product {
    private String name;
    private boolean containsAlcohol;
    private double price;

    public Product(String name, boolean containsAlcohol, double price) {
        this.name = name;
        this.containsAlcohol = containsAlcohol;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public boolean containsAlcohol() {
        return containsAlcohol;
    }

    public double getPrice() {
        return price;
    }
}

class Seller {
    private String name;
    private boolean isHonest;

    public Seller(String name, boolean isHonest) {
        this.name = name;
        this.isHonest = isHonest;
    }

    public String getName() {
        return name;
    }

    public boolean isHonest() {
        return isHonest;
    }
}

class Buyer {
    private String name;
    private int age;
    private boolean hasDiscountCard;

    public Buyer(String name, int age, boolean hasDiscountCard) {
        this.name = name;
        this.age = age;
        this.hasDiscountCard = hasDiscountCard;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean hasDiscountCard() {
        return hasDiscountCard;
    }
}

class Shop {
    private String shopName;
    private Seller seller;
    private Product product;
    private Buyer buyer;

    public Shop(String shopName, Seller seller, Product product, Buyer buyer) {
        this.shopName = shopName;
        this.seller = seller;
        this.product = product;
        this.buyer = buyer;
    }

    public void returnCost(Consumer<String> callback) {
        double cost = product.getPrice();

        if (seller.isHonest() && product.containsAlcohol() && buyer.getAge() < 18) {
            callback.accept("Продавец " + seller.getName() + " из магазина \"" + shopName +
                    "\" отказывается продать вам товар " + product.getName() +
                    ", так как вы несовершеннолетний.");
            return;
        }

        if (buyer.hasDiscountCard()) {
            cost *= 0.9;
        }

        callback.accept("Уважаемый " + buyer.getName() + ", продавец " + seller.getName() +
                " нашего магазина \"" + shopName + "\", продаст вам товар " +
                product.getName() + ", а ваш возраст " + buyer.getAge() +
                ". Стоимость вашей покупки равна " + cost +
                (buyer.hasDiscountCard() ? " Вот вам скидка." : ""));
    }
}

public class Main{
    public static void main(String[] args) {
        Seller honestSeller = new Seller("Честный продавец", true);
        Seller dishonestSeller = new Seller("Нечестный продавец", false);
        Product alcoholProduct = new Product("Алкоголь", true, 100.0);
        Product nonAlcoholProduct = new Product("Хлеб", false, 10.0);
        Buyer buyerWithDiscount = new Buyer("Покупатель со скидкой", 25, true);
        Buyer underageBuyer = new Buyer("Несовершеннолетний покупатель", 15, false);

        Shop shop1 = new Shop("Магазин 1", honestSeller, alcoholProduct, buyerWithDiscount);
        Shop shop2 = new Shop("Магазин 2", dishonestSeller, alcoholProduct, underageBuyer);
        Shop shop3 = new Shop("Магазин 3", honestSeller, nonAlcoholProduct, buyerWithDiscount);

        shop1.returnCost(System.out::println);
        shop2.returnCost(System.out::println);
        shop3.returnCost(System.out::println);
    }
}