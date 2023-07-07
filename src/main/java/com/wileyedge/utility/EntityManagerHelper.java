package com.wileyedge.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
	private static EntityManagerFactory factory;
//	private EntityManager manager;
	
	// This code block is called as soon as the JVM starts, and it sets up the database connection
	// based on the configuration specified in persistence.xml.
	static {
		factory = Persistence.createEntityManagerFactory("JPABasics"); // "JPABasics" is the name of persistence-unit in persistence.xml
	}
	
	// This method creates and returns the actual EntityManager instance, ready to be used for database operations.
	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}
}
