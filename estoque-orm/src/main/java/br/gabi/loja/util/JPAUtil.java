package br.gabi.loja.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {

    private static final EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("lojaPU");

    private JPAUtil() {
    }

    public static EntityManagerFactory getFactory() {
        return factory;
    }

    public static void fechar() {
        if (factory.isOpen()) {
            factory.close();
        }
    }
}
