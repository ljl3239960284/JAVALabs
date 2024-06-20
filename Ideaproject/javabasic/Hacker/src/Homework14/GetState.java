package Homework14;

public class GetState
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
 
		t1.start();
		t2.start();
	}
}
class MyThread implements Runnable
{
	public void run()
	{
		try
		{
			Thread.State thrdState = Thread.currentThread().getState();
			System.out.println("Thread State : " + thrdState);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
