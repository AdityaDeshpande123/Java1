package OOPS;
class ihemployee1
{
    int id;
    String name;
    
    ihemployee1() // Default Constructor
    {
    	this.id = -1;
    	this.name = "NO Name";
    }
    ihemployee1(int id,String name) // Parameterized Constructor
    {
    	this.id = id;
    	this.name = name;
    }
    
    void setValues(int id,String name)
    {
    	this.id = id;
    	this.name = name;
    }
}
//Multiple inheritance
class ihemployee1_1 extends ihemployee1
{
	String dept;
	
	ihemployee1_1(int id,String name,String dept)
	{
		super(id,name);
		this.dept = dept;
	}
	
	void display()
	{
		System.out.println("Name"+this.name);
		System.out.println("Dept"+this.dept);
		System.out.println("Id"+this.id);
	}
	
}
class ihemployee2 extends ihemployee1 //Single level inheritance
{
	String Dept;
	
	ihemployee2()
	{
		super();
		this.Dept = "No Dept";
	}
	ihemployee2(int id,String name,String dept)
	{
		super(id,name);
		this.Dept = dept;
	}
	
	void setValue(int id,String name,String dept)
	{
		super.setValues(id,name);
		this.Dept = dept;
	}
}
//Multi-level Inheritance
class ihemployee3 extends ihemployee2
{
	int salary;
	ihemployee3()
	{
		super();
		this.salary=-1;
	}
	ihemployee3(int id,String name,String dept,int salary)
	{
		super(id,name,dept);
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Name:"+this.name);
		System.out.println("ID:"+this.id);
		System.out.println("Dept:"+this.Dept);
		System.out.println("Salary:"+this.salary);
		
	}
	
}

public class inheritenceforms {
     public static void main(String args[])
     {
    	 new ihemployee3(1,"Aditya","ISE",2000).display();
    	 
     }
}
