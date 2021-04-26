package Niveau3;

public class Sapin {

	public static void main(String[] args) {
		dessinerSapin(7);

	}
	static void dessinerSapin(int n)
	{
		int k=1;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<(n-1-i);j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i+1;j++)
			{
				System.out.print("#");
				
			}
		System.out.println();
		}
		for(int i=0;i<n-2;i++)
		{
			System.out.print(" ");
		}
		for(int i=0;i<3;i++)
		{
			System.out.print("#");
		}
		
	}

}
