package OOPS;

import java.util.Scanner;

public class prime_numbers {
	public static void main(String args[])
	{
		//Using the alogorithm of sieve of erathoses
		System.out.println("Enter the range upto which you want prime numbes :");
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[] = new int[n+1];
		arr[0] = 0;
		arr[1] = 0;
		for(int i=2;i<=n;i++)
			arr[i] = 1;
		for(int i=2;i<=n;i++)
		{
			if(arr[i]==1)
			{
				for(int j=i+1;j<=n;j++)
			    { 
			 	  if(arr[j]==1&&j%i==0)
				  {
					arr[j] = 0;
				  }
			    }
			
			}
		}
		System.out.println("The prime numbers are :");
		
		for(int i=2;i<=n;i++)
		{
			if(arr[i]==1)
				System.out.print(i+" ");
		}
		
		
		
	}
}
