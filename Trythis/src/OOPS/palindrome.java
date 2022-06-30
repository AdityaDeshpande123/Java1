package OOPS;

import java.util.Scanner;

public class palindrome {
	static boolean ispal(String str)
	{
		int n = str.length();
		for(int i=0,j=n-1;i<j;i++,j--)
		{
			if(str.charAt(i) != str.charAt(j))
				return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		String str="Aditya";
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		if(ispal(str))
			System.out.println("Palindrome");
		else
			System.out.println("Not palindrome");
			
		

	}
}
