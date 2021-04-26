package TP_pereNoel;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Enfant {
   String nom,prenom;
   int age;
   Set<Jouet> jouets;
   Iterator<Jouet> iter;
   
   public Enfant(String nom, String prenom, int age)
   {
	   this.nom=nom;
	   this.prenom=prenom;
	   this.age=age;
	   jouets=new HashSet<Jouet>();
   }
   public void addJouet(Jouet jouet)
   {
	   jouets.add(jouet);
   }
   public void afficher()
   {
	 System.out.println("Enfant "+nom+ " a reçu du père Noel:");
	 iter=jouets.iterator();
	 while(iter.hasNext())
	 {
		 Jouet j=iter.next();
		 j.afficherJouet();
	 }
   }
   
}
