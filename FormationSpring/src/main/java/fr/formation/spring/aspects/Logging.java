package fr.formation.spring.aspects;

import org.aspectj.lang.JoinPoint;

public class Logging {
	
	//on créee des pointcuts
	public void beforeMethod(JoinPoint joinPoint ){
		String methode = joinPoint.getSignature().toShortString();
		Object[] args = joinPoint.getArgs();
		
		//pour afficher tous les arguments passés en paramètre:
		StringBuilder builder = new StringBuilder();
		builder.append("Methode: ");
		builder.append(methode);
		builder.append(" Invoqué avec les paramètres suivant : ");
		for (Object o :args){
			builder.append(o);
			builder.append(" - ");
		}
		
		System.out.println(builder.toString());
	}
	
	public void afterMethod(JoinPoint joinPoint, Object result){
		String methode = joinPoint.getSignature().toShortString();
		System.out.println("méthode: " +methode+ " a produit le resultat "+result);
	}
}
