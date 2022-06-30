package OOPS;

import java.util.Scanner;

public class Temp_counvert {
	public static void main(String args[])
	   {
		   System.out.println("Enter temperature in Faranheit : ");
		   Scanner sc = new Scanner(System.in);
		   float faran = sc.nextFloat();
		   float celsius = (float) ((faran-32.0)/1.80);
		   System.out.println("Celsius value is: "+celsius);
		   
		   
		   
	   }
}
