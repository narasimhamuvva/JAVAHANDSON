
public class SharedThread { 
	public void calc(int n)
	{
		for (int i=0;i<5;i++)
		{
			System.out.println(n+i);
		}
	}
	


	
public static void main (String args[])
{
	SharedThread s=new SharedThread();
	Threadone t1=new Threadone(s);
	Threadtwo t2=new Threadtwo(s);
	t2.start();
	t1.start();
	
}
	
	

}
