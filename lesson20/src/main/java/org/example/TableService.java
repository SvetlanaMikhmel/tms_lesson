package org.example;

public interface TableService<T> {
    void insert(T t);

    void delete(int id);

}
