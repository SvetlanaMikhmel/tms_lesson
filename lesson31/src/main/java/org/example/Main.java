package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Session session = AppSessionFactory.getSession();
        Book book = new Book();
        book.setTitle("Поющие в терновнике");
        book.setDescription("«Пою́щие в терно́внике» — семейная сага австралийской писательницы Колин Маккалоу, опубликованная в 1977 году. ");
        book.setPages(608);
        book.setPerson("Колин Маккалоу");
        book.setDate(new Date());
        book.setGenre(Genre.РОМАН);

        Price price = new Price();
        price.setValue(51L);
        price.setCurrency("BYN");
        book.setPrice(price);

        Transaction transaction = session.beginTransaction();

        session.save(book);
        transaction.commit();

        session.close();

    }
}