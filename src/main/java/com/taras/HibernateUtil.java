package com.taras;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    private HibernateUtil() {}

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial Session failed" + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static  SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
