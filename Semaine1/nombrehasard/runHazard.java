package nombrehasard;

public class runHazard {

	public static void main(String[] args) {
		Hazard h1=new Hazard(5);
		h1.afficherTbl();
		//on va ajouter un nombre
		h1.addNumbre(20);
		h1.afficherTbl();
		h1.afficherNombreSupMoyenne();
		String s=h1.toString();
		System.out.println(s);

	}

}
class Hazard {
int tableau[];
double moyenne;
int somme;
	
	public Hazard()
	{
		this.tableau=new int[10];
	}
	public Hazard(int size)
	{
		this.tableau=new int[size];
	    for(int i=0;i<tableau.length;i++)
	    {
	      int aleat= (int) (Math.random()*100);
	       tableau[i]=aleat;
	    }
	}
    public void addNumbre(int nombre)
    {
    	for(int i=0;i<tableau.length;i++)
    	{
    		tableau[i]+=nombre;
    	}
    }
	public double moyenne ()
	{
		int sum=0;
		for(int i=0;i<tableau.length;i++)
		{
		   sum+=tableau[i];	
		}
		return sum/tableau.length;
	}
	public void afficherTbl()
	{
		for(int e:tableau) System.out.print(e+" ");
		System.out.println();
	}
	public void afficherNombreSupMoyenne()
	{
		double moyenne=moyenne();
		for(int e:tableau) {
			if(e>moyenne) System.out.println(e);
		}
	}
	public String toString()
	{
		return "moyen de tab ="+moyenne();
	}
	
	
}
