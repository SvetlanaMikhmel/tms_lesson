package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;

public class AppSessionFactory {
    private static AppSessionFactory factory = new AppSessionFactory();
    private static SessionFactory sessionFactory;

    private AppSessionFactory() {
        Configuration configuration = new Configuration();
        configuration.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        configuration.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/bookstore");
        configuration.setProperty("hibernate.connection.username", "postgres");
        configuration.setProperty("hibernate.connection.password", "");
        configuration.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL95Dialect");
        configuration.setProperty(AvailableSettings.HBM2DDL_AUTO, "none");

        configuration.addAnnotatedClass(Book.class);

        sessionFactory = configuration.buildSessionFactory();

    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
