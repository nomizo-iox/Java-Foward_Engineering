package com.nomizo;

import com.nomizo.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.security.auth.login.Configuration;

public class HibernateForwardEngineering {
    public static void main(String[] args) {

        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure()
                .build();

//        SessionFactory factory = new MetadataSources(registry)
//                .buildMetadata()
//                .buildSessionFactory();

        SessionFactory factory new Configuration().co

        Session session = factory.openSession();
        Transaction transaction = session.beginTransaction();

        Product product = new Product();
        product.setName("iPhone 10");
        product.setPrice(999.88f);

        session.save(product);
        transaction.commit();
        session.close();
        factory.close();
    }


}
