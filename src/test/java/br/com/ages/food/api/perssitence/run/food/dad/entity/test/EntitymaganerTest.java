package br.com.ages.food.api.perssitence.run.food.dad.entity.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class EntitymaganerTest {
	
	   protected static EntityManagerFactory emf;
	   protected EntityManager em;
	   
	   @BeforeAll
	   public static void init_before_all_of_class() {
		   emf = Persistence.createEntityManagerFactory("AlgesFood-Api");
	   }
	   @AfterAll
	   public static void ends_after_all_of_class() {
		   emf.close();
	   }
	   
	   @BeforeEach
	   public void init_before_of_class() {
		   this.em = emf.createEntityManager();
		   em.getTransaction().begin();
	   }
	   
	   @AfterEach
	   public void ends_after_of_class() {
		   em.getTransaction().commit();
		   em.close();
		  
		   
	   }
	   
	   
	 

}
