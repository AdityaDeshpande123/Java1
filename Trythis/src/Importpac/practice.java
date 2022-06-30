package Importpac;

import java.io.*;

class pstu
{
	int id;
	String name;
	// Overloading of constructor
	pstu()
	{
		this.id=-1;
		this.name = "No name";
	}
	pstu(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	//Overloading of methods
	void setValues(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
	void setValues(int id)
	{
		this.id  = id;
	}
	void display()
	{
		System.out.println("Name is : "+this.name);
		System.out.println("Id is : "+this.id);
	}
}
class pstu2 extends pstu
{
	int usn;
	
	pstu2(pstu p,int usn)
	{
		super(p.id,p.name);
	    this.usn = usn;
	}
	pstu2(int id,String name)
	{
		super(id,name);
		this.usn = 01;
	}
	pstu2()
	{
		super();
		this.usn = -1;
	}
	
	void setValues(int id,String name,int usn)
	{
		super.setValues(id,name);
		this.usn = usn;
	}
	
	void display()
	{
		super.display();
		System.out.println("Usn is "+this.usn);
		
	}
	
	
	
}
public class practice {

	public static void main(String[] args) throws IOException {
		
	   
	  /*pstu p1 = new pstu(1,"Adi");
	  p1.display();
	  pstu2 p2 = new pstu2(p1,10);
	  p2.display();*/
		
	 String str1 = new String("Aditya");
	
	 //str1 += "Sachit";
	 
	 char str2[] = new char[100];
	 
	 str1.getChars(0, 6, str2, 0);
     
	 System.out.println(str1);
	 
	 //PrintWriter
	 PrintWriter pw = new PrintWriter(System.out,true);
	 pw.println(str2);
	 
	 
     //Lastindex and Index	 
//	 System.out.println(str1.lastIndexOf('a'));
//	 System.out.print(str1.indexOf('A'));
	 
	 //compare
	 
	 String str3[] = {"A","C","B"};
	 
//	 System.out.println(str3.compareTo(str1));
	 for(int i=0;i<str3.length;i++)
	 {
		 for(int j=i+1;j<str3.length;j++)
		 {
			 if(str3[i].compareTo(str3[j])>0)
			 {
				 String temp = str3[i];
				 str3[i] = str3[j];
				 str3[j]= temp;
			 }
			 
		 }
	 }
	 
	 for(int i=0;i<str3.length;i++)
	 {
		 System.out.println(str3[i]);
	 }
		
	 
	 byte b1 [] = {65,66,67};
	 
	 String sp2 = new String(b1,0,1);
	 System.out.println(sp2);
	 
	 
	 BufferedReader br = new 	BufferedReader(new InputStreamReader(System.in));
	 
	 //String str = br.readLine();
	 //char ch = (char)br.read();
     //System.out.println(ch);		
     
     
     String x = "Aditya is Coding";
     
     System.out.println(x.endsWith("Aditya"));
     
     System.out.println(x.equalsIgnoreCase("Aditya is Coding"));
     System.out.println(x=="Aditya is Coding");
     
     double d = 4.5e-7;					
		pw.println(d);

	}

}
