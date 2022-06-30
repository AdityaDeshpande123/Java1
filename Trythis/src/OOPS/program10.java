package OOPS;
import java.util.Random;
class Mythread1 extends Thread
{
	int num;
	Mythread1(int a)
	{
		this.num= a;
	}
	public void run()
	{
		System.out.println("The square of number is :"+this.num*this.num);
	}
}
class MyThread2 extends Thread
{
	int num;
	MyThread2(int num){
		this.num = num;
	}
	public void run()
	{
		System.out.println("The cube of the number is :"+this.num*this.num*this.num);
	}
}
class MyThread3 extends Thread
{
  int no;
  MyThread3(int no)
  {
	  this.no = no;
  }
  public void run()
  {
	  Random random = new Random();
	  
	  for(int i=1;i<=this.no;i++)
	  {
		  System.out.println("The number is :"+random.nextInt(100));
		  try {
			MyThread3.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception cauht");
		}
		  
	  }
  }
	
}
public class program10 {

	public static void main(String[] args) {
        Mythread1 t1 = new Mythread1(2);
        t1.start();
        MyThread2 t2 = new MyThread2(3);
        t2.start();
        MyThread3 t3 = new MyThread3(5);
        t3.start();

	}

}
