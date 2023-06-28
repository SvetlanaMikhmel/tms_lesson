package org.example.generic;

public class Wine extends Goods {
    public enum KindsOfWines{
        WHITE,
        RED,
        PINK
    }
    public KindsOfWines kindsOfWines;

    public Wine(double price, int countOfGoods, KindsOfWines kindsOfWines) {
        super(price, countOfGoods);
        this.kindsOfWines = kindsOfWines;
    }

    public KindsOfWines getKindsOfWines() {
        return kindsOfWines;
    }

    public void setKindsOfWines(KindsOfWines kindsOfWines) {
        this.kindsOfWines = kindsOfWines;
    }

    @Override
    public String toString() {
        return "Wine{" +
                "kindsOfWines=" + kindsOfWines +
                "} " + super.toString();
    }
}
