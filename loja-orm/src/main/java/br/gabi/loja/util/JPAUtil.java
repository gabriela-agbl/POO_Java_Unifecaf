package br.gabi.loja.util;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JPAUtil {
	private static final EntityManagerFactory factory 
	= Persistence.createEntityManagerFactory("lojaA");
	
	public static EntityManagerFactory getFactory() {
		return factory;
	}
	
	public static void fechar() {
		if (factory.isOpen()) {
			factory.close();
		}
	}
}
