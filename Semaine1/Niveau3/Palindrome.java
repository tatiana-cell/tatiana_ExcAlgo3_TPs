package Niveau3;

public class Palindrome {

	public static void main(String[] args) {
		
		boolean b=isPalindrome(456787654);
		System.out.println(b);

	}
	static boolean isPalindrome(long n)
	{
	  String s=Long.toString(n);
	  char[]tbl=s.toCharArray();
	  for(int i=0,j=tbl.length-1;i<j;i++,j--)
	  {
		  if(tbl[i]!=tbl[j]) return false; 
	  }
		
		return true;
	}
	

}
