package OOPS;

import java.util.Scanner;

interface test
{
	int square(int a);
}

class arith implements test
{
    
	public int square(int a)
	{
		return a*a;
	}
	
}
class ToTestInt
{
	ToTestInt()
	{
		arith a1 = new arith();
		System.out.println("Enter a number :");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a1.square(a));		
	}
	
}
public class program7_interface {
	
	public static void main(String[] args) {
		
		new ToTestInt();
	}

}
