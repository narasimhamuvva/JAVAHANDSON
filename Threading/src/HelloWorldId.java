
public class HelloWorldId implements Runnable{
		public void run()
		{
			long ThreadId=Thread.currentThread().getId();
			System.out.println("Thread no:"+ThreadId+"\t"+"Hello World");
		}
	public static void main(String args[])
	{
		HelloWorldId hw=new HelloWorldId();
		for(int i=0;i<5;i++)
		{
		Thread t=new Thread(hw); 
		t.start();
		}
		
	}
		

	}


