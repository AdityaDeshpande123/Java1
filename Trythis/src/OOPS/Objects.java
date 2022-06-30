package OOPS;
class Employee
{
	int id;
	String name;
	
	Employee()
	{
		this.id = -1;
		this.name = "I don't know his name";
		
	}
	Employee(Employee ex)
	{
		this.id = ex.id;
		this.name = ex.name;
	}
	Employee setvalue(Employee ex)
	{
		Employee empnew = new Employee();
		empnew.id = ex.id;
		empnew.name = ex.name;
		
		return empnew;
		
	}
	void display()
	{
		System.out.println("Name :"+this.name);
		System.out.println("Id :"+this.id);
		
	}
	
}
public class Objects {

	public static void main(String args[])
	{
		
		Employee emp1 = new Employee();
		emp1.id = 1;
		emp1.name = "Adi";
		
		Employee emp2 = new Employee();
		emp2 = emp2.setvalue(emp1);
		
		emp1.display();
		emp2.display();
		
	}
	
}
