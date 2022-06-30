package OOPS;

class MyException extends Exception
{
	
	public static int age;
	MyException(int x)
	{
		this.age=x;
		System.out.println("MyException "+age);
	}
	
}

public class program8_exception {
	
	static void except(int a) throws MyException
	{
		if(a>18)
			throw new MyException(a);
		
		System.out.println("Completed");
		
	}
	public static void main(String[] args) {
			
		try
		{
			except(20);
			
		}
		catch(Exception e)
		{
			System.out.println("Exception caught");
		}
		
		
	}

}
