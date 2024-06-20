package Homework14;

public class CreateThread extends Thread
{
	public static void main(String[] args)
	{
		CreateThread thrd = new CreateThread();
 
		thrd.start();
 
		System.out.println("Outside the Thread");
	}
 
	public void run()
	{
		System.out.println("Thread Executed");
	}
}