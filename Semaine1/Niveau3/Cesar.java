package Niveau3;

public class Cesar {

	public static void main(String[] args) {
		
		
		char[]t= {'A','B','C','D','E','F','G','H','I','J','K',
				'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
	afficherCodes(t);	
	
	
	
	String s=coderString("ABC");
	System.out.println(s);
	String s2=decoderString(s);
	System.out.println(s2);
	}
	
	
	
	static String coderString(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			char dc=coderChar(c,3);
			s+=dc;
		}
		
		return s;
		
	}
	static String decoderString(String str)
	{
		String s="";
		for(int i=0;i<str.length();i++)
		{
			char c=str.charAt(i);
			char dc=decoderChar(c,3);
			s+=dc;
		}
		
		return s;
	}
	
	static char decoderChar(char carCode, int cle)
	{
		int ascii=carCode-cle;
		return (char)ascii;
	}
	
	static char coderChar(char c,int cle)
	{
	   int code=c;
	   int r = 0;
	   if((code>64)&&(code<91))
	   {
		   r=code+cle;
		   System.out.println("r est:"+r);
		  
	   }
	   return (char)r;		
	}
	
	static void afficherCodes(char[]tc)
	{
		int[] t=new int[tc.length];
		for(int i=0;i<tc.length;i++)
		{
			t[i]=tc[i];
			System.out.println(i+":"+tc[i]+":"+t[i]);
		}
	}

}
