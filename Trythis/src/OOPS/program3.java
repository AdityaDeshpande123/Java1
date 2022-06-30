package OOPS;

import java.util.Scanner;

class studentnew
{
	String Name;
	String Usn;
	String Branch;
	String Phone;
	
	studentnew(String Name,String Usn,String Branch,String phone)
	{
		this.Name = Name;
		this.Usn = Usn;
		this.Branch = Branch;
	    this.Phone = phone;
	}
	
}
public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements :");
		int n = sc.nextInt();
		studentnew stulist[] = new studentnew[n];
		
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter details of student:" + (i+1));
			String Name,Usn,Branch,Phone;
			Name = sc.next();
			Usn = sc.next();
			Branch = sc.next();
			Phone = sc.next();
			stulist[i] = new studentnew(Name,Usn,Branch,Phone);
		}
		
		for(int i=0;i<n;i++)
		{
		   System.out.println("Student no :" + (i+1));
		   System.out.println("Name : " +stulist[0].Name);
		   System.out.println("Branch : " +stulist[0].Branch);
		   System.out.println("Usn : "+ stulist[0].Usn);
		   System.out.println("Phone : "+ stulist[0].Phone);
		   
		}		
	
		
		

	}

	
}
