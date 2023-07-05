package org.example.generic;

public interface ActionsWithGoods<T> {
    void addGoods(T goods);

    void orderGoods(T goods);

    void removeGoods(T goods);

}
