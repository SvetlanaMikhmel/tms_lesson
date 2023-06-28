package org.example.generic;

public class Cheese extends Goods {
    public enum KindsOfCheese {
        Cheddar,
        Mozzarella,
        Parmesan,
        Suluguni
    }

    private KindsOfCheese kindsOfCheese;

    public Cheese() {
    }

    public Cheese(double price, int countOfGoods, KindsOfCheese kindsOfCheese) {
        super(price, countOfGoods);
        this.kindsOfCheese = kindsOfCheese;
    }

    public KindsOfCheese getKindsOfCheese() {
        return kindsOfCheese;
    }

    public void setKindsOfCheese(KindsOfCheese kindsOfCheese) {
        this.kindsOfCheese = kindsOfCheese;
    }

    @Override
    public String toString() {
        return "Cheese{" +
                "kindsOfCheese=" + kindsOfCheese +
                "} " + super.toString();
    }
}
