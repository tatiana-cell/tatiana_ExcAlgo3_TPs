package TP_Banque;

public class GererComptes {

	public static void main(String[] args) {
		Compte c1=new Compte("Dupont");
		c1.afficherCompte();
		Compte c2=new Compte("Blanc");
		c2.afficherCompte();
		Compte c3=new Compte("Black",100.00);
		c3.afficherCompte();
		Compte c4=new Compte("Fred",250);
		c4.afficherCompte();
		Compte c5=new Compte("Zip",330);
		c5.afficherCompte();

	}

}
