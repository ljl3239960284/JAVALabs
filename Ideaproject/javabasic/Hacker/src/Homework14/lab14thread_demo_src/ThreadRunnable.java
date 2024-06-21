package Homework14.lab14thread_demo_src;

public class ThreadRunnable 
{
	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread says "+Thread.currentThread().getName()+" Hi "+i);
			
			if(i==5) 
			{
                  Thread t1 = new Thread(new RunThread(),"child thread 1");
                  t1.start();
                  Thread t2 = new Thread(new RunThread(),"Child thread 2");
				  t2.start();
			}
			
		}
	}

}


class RunThread implements Runnable
{

  public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child thread "+Thread.currentThread().getName()+" run "+i);
		}
	}
}