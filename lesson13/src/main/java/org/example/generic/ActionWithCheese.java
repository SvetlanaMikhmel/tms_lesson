package org.example.generic;

public class ActionWithCheese implements ActionsWithGoods<Cheese> {


    public void addGoods(Cheese goods) {
        System.out.println("add " + goods);

    }


    public void orderGoods(Cheese goods) {
        System.out.println("order " + goods);

    }


    public void removeGoods(Cheese goods) {
        System.out.println("remove " + goods);

    }
}
