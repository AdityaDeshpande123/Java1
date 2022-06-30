package OOPS;

import java.util.Scanner;

public class factorial {

	
		static int factorial(int n)
		{
			if(n<=1)
				return 1;
			return n*factorial(n-1);
		}
		public static void main(String[] args) {
			System.out.println("Enter the number whose factorial is to be computed");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int fact = factorial(n);
			System.out.println("The factorial is: "+fact);
		}

	

}
