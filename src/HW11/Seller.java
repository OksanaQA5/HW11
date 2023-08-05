package HW11;

import java.util.function.Function;

class Seller {
    private String name;
    private boolean honest;

    public Seller(String name, boolean honest) {
        this.name = name;
        this.honest = honest;
    }

    public boolean isHonest() {
        return honest;
    }

    public String getName() {
        return name;
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

class Purchase {
    private String itemName;
    private double itemPrice;
    private boolean isAlcoholic;

    public Purchase(String itemName, double itemPrice, boolean isAlcoholic) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.isAlcoholic = isAlcoholic;
    }

    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }
}

class Shop {
    public void returnCost(Function<Purchase, Boolean> sellerPolicy, Function<Buyer, Boolean> buyerDiscount, Purchase purchase, Seller seller, Buyer buyer) {
        double cost = purchase.getItemPrice();
        if (sellerPolicy.apply(purchase)) {
            if (buyerDiscount.apply(buyer)) {
                cost *= 0.9;
            }
            System.out.println("Уважаемый " + buyer.getName() + ", продавец " + seller.getName() + " нашего магазина \"" + purchase.getItemName() + "\", продаст вам этот товар " + purchase.getItemName() + ", в них есть алкогольная продукция, а ваш возраст " + buyer.getAge() + ". Стоимость вашей покупки равна " + cost + " Вот вам скидка");
        } else {
            System.out.println("Извините, продавец " + seller.getName() + " не может продать вам товар " + purchase.getItemName() + " в связи с алкогольной продукцией.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Seller seller = new Seller("Иван", true);
        Buyer buyer = new Buyer("Петр", 30, true);
        Purchase purchase = new Purchase("Вино", 100.0, true);

        Shop shop = new Shop();
        shop.returnCost(
                purchase -> seller.isHonest() || !purchase.isAlcoholic(),
                buyer -> buyer.hasDiscountCard(),
                purchase, seller, buyer
        );
    }
}