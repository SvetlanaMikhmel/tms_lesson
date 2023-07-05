package org.example.generic;

public class Main {
    public static void main(String[] args) {
        ActionsWithWine actionsWithWine = new ActionsWithWine();
        Wine wine = new Wine(40.50, 10, Wine.KindsOfWines.RED);
        actionsWithWine.addGoods(wine);
        actionsWithWine.orderGoods(wine);
        actionsWithWine.removeGoods(wine);

        System.out.println("____________________");

        ActionWithCheese actionWithCheese = new ActionWithCheese();
        Cheese cheese = new Cheese();
        actionWithCheese.addGoods(cheese);
        actionWithCheese.orderGoods(cheese);
        actionWithCheese.removeGoods(cheese);
    }

}
