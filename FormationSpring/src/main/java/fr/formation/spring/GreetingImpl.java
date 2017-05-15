package fr.formation.spring;

public class GreetingImpl implements Greeting {

	private Hello theHello;
	
	public void setTheHello(Hello theHello) {
		this.theHello = theHello;
	}


	public String sayGreeting(String name) {
		// TODO Auto-generated method stub
		return theHello.sayHello(name) + " nice to meet you";
	}

}
