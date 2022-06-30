package OOPS;
class student_override
{
	String name;
	int id;
	
	student_override()
	{
		this.name = "No Name specified";
		this.id = -1;
	}
	student_override(String name)
	{
		this.name = name;
		this.id = -1;
	}
	student_override(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	//Below is the demonstration of method overloading
	//Here two functions with same name have been declared with different type of parameter. This is called Function
	//overloading
	void setData(String name)
	{
		this.name = name;
		this.id = -1;
	}
	void setData(int id)
	{
		this.id = id;
		this.name = "No Name";
	}
	void setData(String name,int id)
	{
		this.name = name;
		this.id = id;
	}
	void display()
	{
		System.out.println("Name is :"+this.name);
		System.out.println("Id is :"+this.id);
	}
	
}
class studentnew_override extends student_override  //Single Inheritance
{
	String Usn;
	//Super can be used to call the constructor,methods or instance variables of super class
	//Note that super has no relation with overriding
	studentnew_override()
	{
		super();
		this.Usn = "No Usn";
	}
	studentnew_override(String name)
	{
		super(name);
		this.Usn = "No Usn";
	}
	
	//Overriding of setData method of the super class
	void setData(String name,int id,String usn)
	{
		super.setData(name,id);
		this.Usn = usn;
	}
	//Overloading of the overrided method setData
	void setData(String name,String usn)
	{
		super.setData(name);
		this.Usn = usn;
	}
	void display()
	{
		super.display();
		System.out.println("Usn is :"+this.Usn);
		
	}
	
}
class studentmnew_override extends studentnew_override //Multiple inheritance
{
	studentmnew_override()
	{
		super();
	}
	void display()
	{
		super.display();
	}
	
}
public class overriding {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		student_override stu1 = new student_override();
		stu1.setData("Aditya");
		stu1.display();
		studentnew_override stu2 = new studentnew_override();
		stu2.setData("Adi","005");
		stu2.display();
		
		studentmnew_override stu3 = new studentmnew_override();
		stu3.display();
		
	}

}
