package TP;

public class Exc2 {

	public static void main(String[] args) {
		String s="Le monde est beau!";
		String bout="ond";
		System.out.println(dansMot(bout,s));
		String s1="kayak";
		System.out.println(isPalindrome(s1));
        String s2="xanax";
        System.out.println(isPalindrome(s2));
        String s3="sommes";
        System.out.println(isPalindrome(s3));
		
	}
	static boolean isPalindrome(String str)
	{
		char[]arr=str.toCharArray();
		for(int i=0,j=arr.length-1;i<j;i++,j--)
		{
			if(arr[i]!=arr[j]) return false;
		}
		return true;
	}
	
	static boolean dansMot(String bout, String str)
	{
		return str.contains(bout);
		
	}
	

}
