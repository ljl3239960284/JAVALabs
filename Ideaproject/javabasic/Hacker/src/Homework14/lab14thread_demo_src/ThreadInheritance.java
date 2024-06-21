package Homework14.lab14thread_demo_src;

public class ThreadInheritance {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread says "+Thread.currentThread().getName()+" Hi "+i);
			
			if(i==5) 
			{
                    HelloThread ht1 = new HelloThread();
                    ht1.start();
                    
                    HelloThread ht2 = new HelloThread();
                    ht2.start();
				
			}
			
		}
	}

}


class HelloThread extends Thread
{
	public void run() 
	{
		super.run();
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Child thread name:"+this.getName()+" "+i+" hello");
		}
		
	}
	
}