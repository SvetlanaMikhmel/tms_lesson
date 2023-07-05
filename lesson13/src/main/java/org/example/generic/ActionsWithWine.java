package org.example.generic;

public class ActionsWithWine implements ActionsWithGoods<Wine> {


    public void addGoods(Wine goods) {
        System.out.println("add " + goods);

    }


    public void orderGoods(Wine goods) {
        System.out.println("order " + goods);

    }


    public void removeGoods(Wine goods) {
        System.out.println("remove " + goods);

    }
}
