package HW11;

enum ProductType {
    APPLE(30),
    POTATO(20),
    MILK(50),
    BEER(70),
    TOBACCO(100);

    private final int price;

    ProductType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

class UnpleasantSituationException extends Exception {
    public UnpleasantSituationException(String message) {
        super(message);
    }
}

class Father {
    private String name;
    private int moneyInPocket;

    public Father(String name, int moneyInPocket) {
        this.name = name;
        this.moneyInPocket = moneyInPocket;
    }

    public void goToStore(ProductType product1, int quantity1, ProductType product2, int quantity2) throws UnpleasantSituationException {
        int totalCost = product1.getPrice() * quantity1 + product2.getPrice() * quantity2;

        if (totalCost > moneyInPocket) {
            throw new UnpleasantSituationException("Сумма покупки превышает количество денег в кармане отца");
        }

        if (product1 == ProductType.BEER || product1 == ProductType.TOBACCO || product2 == ProductType.BEER || product2 == ProductType.TOBACCO) {
            throw new UnpleasantSituationException("Отцу запрещено покупать пиво или табак");
        }

        if (quantity1 % 3 != 0 || quantity2 % 3 != 0) {
            throw new UnpleasantSituationException("Количество одного из товаров не делится на три");
        }

        System.out.println("Уважаемый " + name + ", стоимость ваших покупок " + totalCost + ".");
        System.out.println("Вы приобрели " + product1 + " в количестве " + quantity1 + ", и " + product2 + " в количестве " + quantity2 + ".");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Father father = new Father("Валентин", 200);

            ProductType product1 = ProductType.APPLE;
            int quantity1 = 3;
            ProductType product2 = ProductType.MILK;
            int quantity2 = 6;

            father.goToStore(product1, quantity1, product2, quantity2);
        } catch (UnpleasantSituationException e) {
            System.out.println("Произошла неприятная ситуация: " + e.getMessage());
        }
    }
}