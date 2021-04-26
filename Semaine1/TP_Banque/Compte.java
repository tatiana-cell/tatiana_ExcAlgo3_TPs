package TP_Banque;

public class Compte {
	private final String nom_banc="ParisEpargne";
	private final String debutRIB="12345 6789_"; 
    private static int prochaine_numero=1;
    private int numeroCmpt;
    private String titulaire;
    private double solde;
    private int nmbr_clients;
    
    
    public Compte(String titulaire)
    {
    	this.titulaire=titulaire;
    	numeroCmpt=prochaine_numero;
    	solde=0.0;
    	Compte.prochaine_numero+=1;
    	nmbr_clients=1;
    	
    }
    public Compte(String titulaire, double solde)
    {
       this(titulaire);
       this.solde=solde;
    }
    
    public double getSolde()
    {	return solde; }
    
    public void deposer(double montant)
    {
    	if(montant<0) throw new IllegalArgumentException("Montant ne peut pas être negatif");
    	else {
    	this.solde+=montant;
    	System.out.println("Après dépot le solde est:"+solde);
    	}
    }
    public void retrait(double montant)
    {
    	if(montant>solde) throw new IllegalArgumentException("Votre montant depasse"
    			+ "le niveau authorisé");
    	else {
    		solde-=montant;
    		System.out.println("Après le retrait le solde est:"+solde);
    	}
    }
    
    public void setNombreClients(int  nmbr)
    {
    	this.nmbr_clients=nmbr;
    }
    public void afficherCompte()
    {
    	System.out.println(nom_banc+" RIB:"+debutRIB+numeroCmpt);
    	System.out.println("Client "+titulaire+" son solde "+solde+" nombre de clients "+nmbr_clients);
    }
    
    
    
}
