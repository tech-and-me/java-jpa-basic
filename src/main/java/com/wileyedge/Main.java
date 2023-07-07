package com.wileyedge;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.wileyedge.utility.EntityManagerHelper;

public class Main {

	public static void createEmployee() {
		
		Address a = new Address("Sydney","2000");
		Employee e = new Employee(10,"Maddie","Davis"); // Transient state
		
		e.setAddr(a);
		
		EntityManager em = EntityManagerHelper.getEntityManager();	
		
		EntityTransaction tx = em.getTransaction();
		
		tx.begin(); // to begin the transaction. all transactions between begin() and commit() or begin() and rollback() 
		//will be treated as a single logical unit.
		
//		em.persist(a);
		em.persist(e); // Managed State  // this will keep track of all the changes but not yet insert to the table yet until commit.
		
		tx.commit();  // this will insert row containing all e attributes to the table
	
	}

	public static void main(String[] args) {
		createEmployee();
	}

}
