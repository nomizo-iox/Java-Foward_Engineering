package com.nomizo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateForwardEngineering {
    public static void main(String[] args) {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

        SessionFactory factory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();

        Session session = factory
                .openSession();

        session.beginTransaction();

        Transaction transaction = session
                .beginTransaction();
    }


}
