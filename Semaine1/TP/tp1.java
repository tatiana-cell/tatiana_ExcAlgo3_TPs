package TP;

public class tp1 {

	public static void main(String[] args)
	{
      String s="FORMATION-JAVA";
		//afficherMot(s);
       afficherInvers(s);
	}
	
	static void afficherInvers(String mot)
	{
		for(int i=mot.length()-1;i>0;i--)
		{
			System.out.println(mot.charAt(i));
		}
	}
	
	static void afficherMot(String mot)
	{
		 for(int i=0;i<mot.length();i++)
		 {
			 System.out.println(mot.charAt(i));
		 }
	}

}
