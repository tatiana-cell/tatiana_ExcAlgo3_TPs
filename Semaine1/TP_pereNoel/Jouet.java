package TP_pereNoel;

public class Jouet {
protected String descr;
protected boolean dispo;

   public Jouet(String descr)
   {
	  this.descr=descr;
	  dispo=true;
   }
   public void setNonDispo()
   {
	   dispo=false;
   }
   public void afficherJouet()
   {
	   System.out.println("jouet "+descr + dispo);
   }
   
}
