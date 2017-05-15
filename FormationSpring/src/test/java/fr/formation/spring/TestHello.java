package fr.formation.spring;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	
	//on va pouvoir récupérer les intances de nos objets à partir de là
	private static ApplicationContext context;
	
	//on utilise des annotations pour indiquer quelles méthodes seront exécutées avant le test ou pendant/après
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		context = new ClassPathXmlApplicationContext("app-context.xml");
	}
	
	@Test
	public void testSayHello(){
		//on utilise l'interface 
		Hello hello = (Hello)context.getBean("hello"); //on cherche le bean hello et on référence l'implémenteur
		String message = hello.sayHello("Barth");
		
		//On fait une assertion pour le test:
		assertEquals("Hello Barth",message);//à gauche ce qu'on attend, à droite notre message
	}
}
