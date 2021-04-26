package Biblio;

public class Livre {
   private int ISBN;
   private String titre;
   private double prix;
   
   
   public Livre(String titre,int ISBN,double prix)
   {
	   this.titre=titre;
	   this.ISBN=ISBN;
	   this.prix=prix;
   }
   
    public String getTitre()
    {
    	return titre;
    }
    public int getISBN ()
    {
    	return this.ISBN;
    }
    public double getPrix()
    {
    	return this.prix;
    }
    public void setPrix(double p)
    {
    	this.prix=p;
    }
    public String toString()
    {
    	return "Livre "+titre+" avec ISBN "+ISBN+" au prix de "+prix;
    }
    
}
