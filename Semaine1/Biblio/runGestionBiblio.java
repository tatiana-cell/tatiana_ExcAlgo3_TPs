package Biblio;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class runGestionBiblio{
	public static void main (String[]Args)
	{
		GestionBiblio gb =  new GestionBiblio();
		gb.ajoutLivre(new Livre("titre1",1234,12.00));
		gb.ajoutLivre(new Livre("titre2",5678,13.00));
	    gb.ajoutLivre(new Livre("titre3",6789,14.00));
        Livre l2=gb.trouverLivre(5678);	
        System.out.println(l2.toString());
        gb.afficherLivres();
        double somme=gb.totalEuros();
        System.out.println("somme="+somme);
        int n=gb.totalLivres();
        System.out.println("nombre des livres "+n);
        System.out.println("#########################");
        gb.ajoutLivre(new Livre("titre4",9876,18.00));
        gb.afficherLivres();
        n=gb.totalLivres();
        System.out.println("nombre des livres "+n);
        somme=gb.totalEuros();
        System.out.println("somme="+somme);
        gb.supprimerLivre(new Livre("titre2",5678,13.00));
        gb.afficherLivres();
	
	
	}
}

class GestionBiblio {
private  HashMap<Integer, Livre> livres;


   public GestionBiblio()
   {
	   livres=new HashMap();
   }
   
public int totalLivres()
{
	Set<Integer> keys=livres.keySet();
	return keys.size();
}
public double totalEuros()
{
	double total=0.0;
	 Set<Integer>tabcles=livres.keySet();
	 Iterator iter=tabcles.iterator();
	 while(iter.hasNext())
	 {
		 int cle= (int) iter.next();
		 Livre livre=livres.get(cle);
		 total+=livre.getPrix();
		 		 
	 }
	 return total;
}


 public void afficherLivres()
 {
	 Set<Integer>tabcles=livres.keySet();
	 Iterator iter=tabcles.iterator();
	 while(iter.hasNext())
	 {
		 int cle= (int) iter.next();
		 Livre livre=livres.get(cle);
		 String s=livre.toString();
		 System.out.println(s);
		 		 
	 }
 }
 
   
   public void ajoutLivre(Livre livre)
   {
	   int cle=livre.getISBN();
	   if(livres.containsKey(cle))
	   {
		   System.out.println("Déjà dans la liste");
	   }else {
		   livres.put(cle,livre);
	   }
   }
   public void supprimerLivre(Livre livre)
   {
	  int cle=livre.getISBN();
	  if(livres.containsKey(cle))
	  {
		  livres.remove(cle);
	  }else {
		  System.out.println("Il n'y a pas de livre avec num "+cle);
	  }
   }
   public Livre trouverLivre(int ISBN)
   {
	 	   return livres.get(ISBN);
   }
 
}
