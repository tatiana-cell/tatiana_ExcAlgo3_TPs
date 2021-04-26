package Niveau3;

public class Racine {

	public static void main(String[] args) {
		int res=racine(343,3);
		System.out.println(res);

	}
	static int racine(int x,int n)
	{
	 int div=x;
	 int res=0;
	 for(int i=2;i<x;i++)
	  {
		for(int j=0;j<n;j++)
		{
			if(div%i==0) div=div/i;
		}
		if(div==1) return i;
	  }
		return 0;
		
	}

}
