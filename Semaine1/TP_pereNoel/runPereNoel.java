package TP_pereNoel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class runPereNoel {

	public static void main(String[] args) {
		PereNoel papaNono=new PereNoel();
		// Noémie Truc à 8 ans :
	Enfant nono = new Enfant("Nono","Noémie",8);
   // Joachim Machin à 6 ans :
	Enfant jojo = new Enfant("Jojo","Joachim",6);
	// Soufiane Touti à 9 ans :
	Enfant souf = new Enfant("Souf","Soufiane",9);
		
	Enfant doublon = new Enfant("Bidule","Noémie",8);


	Jouet joujou1 = new Jouet("1-Ferrari 308GTB");
	Jouet joujou2 = new Jouet("2-BarbiZou la poupée qui gazouille ");
	Jouet joujou3	= new Jouet("3-Super puzzle avec 180 pièces ");
	Jouet joujou4 = new Jouet("4-Mikado");
	Jouet joujou5 = new Jouet("5-Rubik's Cube");
	Jouet joujou6	= new Jouet("6-iPad");
	
	papaNono.ajouterJouet(joujou1);
	papaNono.ajouterJouet(joujou2);
	papaNono.ajouterJouet(joujou3);
	papaNono.ajouterJouet(joujou4);
	papaNono.ajouterJouet(joujou5);
	papaNono.ajouterJouet(joujou6);
	
	papaNono.ajouterEnfant(nono);
	papaNono.ajouterEnfant(jojo);
	papaNono.ajouterEnfant(souf);
	
	papaNono.afficherListeDesEnfants();
	papaNono.afficherListeDesJouets();
	
	papaNono.distribuer(nono,joujou1);
	papaNono.distribuer(jojo, joujou2);
	System.out.println("apres distribtion de jouet 1 et 2:");
	papaNono.afficherListeDesJouets();
	System.out.println("****************");
	papaNono.distribuer(souf,joujou3);
	papaNono.distribuer(souf,joujou4);
	papaNono.distribuer(nono,joujou5);
	papaNono.distribuer(jojo,joujou6);

	nono.afficher();
	jojo.afficher();
	souf.afficher();
	papaNono.distribuer(nono,joujou2);
	
	nono.afficher();
    papaNono.afficherListeDesJouets();	

	}

}
class PereNoel {
	Set<Jouet>jouets;
	Set<Enfant>enfants;
	Iterator iter;	
     
	public PereNoel()
	{
	  jouets=new HashSet<Jouet>();
	  enfants=new HashSet<Enfant>();
		
	}
	public void ajouterJouet(Jouet jouet)
	{
		jouets.add(jouet);
	}
	public void ajouterEnfant(Enfant enfant)
	{
		enfants.add(enfant);
	}
	
	public void distribuer(Enfant enfant,Jouet jouet)
	{
		jouets.remove(jouet);
		if(jouet.dispo) 
		{
		  enfant.addJouet(jouet);
		  jouet.setNonDispo();
		}else {
			System.out.println("Le jouet "+jouet.descr+" n'est plus disponible");
		}
		
		
	}
	public void afficherListeDesEnfants()
	{
		iter=enfants.iterator();
		while(iter.hasNext())
		{
			Enfant enf=(Enfant)iter.next();
			System.out.println(enf.nom+" "+enf.prenom);
		}
	}
	
	public void afficherListeDesJouets()
	{
		if(jouets.size()==0)
		{
			System.out.println("Il n'y plus de jouets....");
		}
		iter=jouets.iterator();
		while(iter.hasNext())
		{
			Jouet jouet=(Jouet)iter.next();
			System.out.println(jouet.descr);
		}
	}
	
	public void afficher()
	{
		iter=enfants.iterator();
		while(iter.hasNext())
		{
			Enfant enf=(Enfant) iter.next();
			enf.afficher();
		}
	}
	
}

