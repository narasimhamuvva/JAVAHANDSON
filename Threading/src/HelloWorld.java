
public class HelloWorld implements Runnable{
	public void run()
	{
		System.out.println("Hello World");
	}
public static void main(String args[])
{
	HelloWorld hw=new HelloWorld();
	for(int i=0;i<5;i++)
	{
	Thread t=new Thread(hw); 
	t.start();
	}
	
}
	

}
