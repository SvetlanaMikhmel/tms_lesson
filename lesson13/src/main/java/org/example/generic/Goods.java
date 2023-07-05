package org.example.generic;

public abstract class Goods {
    private double price;
    private int countOfGoods;

    public Goods() {
    }

    public Goods(double price, int countOfGoods) {
        this.price = price;
        this.countOfGoods = countOfGoods;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCountOfGoods() {
        return countOfGoods;
    }

    public void setCountOfGoods(int countOfGoods) {
        this.countOfGoods = countOfGoods;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "price=" + price +
                ", countOfGoods=" + countOfGoods +
                '}';
    }
}
