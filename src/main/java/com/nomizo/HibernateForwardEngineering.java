package com.nomizo;

import com.nomizo.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateForwardEngineering {
    public static void main(String[] args) {

        Product product = new Product();
        product.setName("Tesla Model Y");
        product.setDescription("This is the latest item coming this fall");
        product.setPrice(64000.81F);

        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();

        System.out.println("-----LOADING SESSION FACTORY------");

        Session session = sessionFactory.openSession();
        System.out.println("-----SESSION OPENED-----");

        session.beginTransaction();
        System.out.println("-----TRANSACTION ENTRANCE-----");

        session.save(product);
        System.out.println("-----OBJECT SAVED-----");

        session.getTransaction().commit();
        System.out.println("-----OBJECT COMMITTED-----");

        session.close();
        System.out.println("-----SESSION CLOSED-----");

        sessionFactory.close();
        System.out.println("-----SESSION-FACTORY CLOSED-----");

    }


}
