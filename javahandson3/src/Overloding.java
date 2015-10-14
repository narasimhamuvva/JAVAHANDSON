
public class Overloding {
	
public void multiply(int a,int b)
{
	System.out.println("multiplication of integer numbers is="+a*b);
}
public void multiply(float a,float b)
{
	System.out.println("multiplication of float numbers is="+a*b);	
}
public static void main(String args[])
{
	Overloding ov= new Overloding();
	ov.multiply(4.6f, 6.7f);
	ov.multiply(10, 10);
	

}
}


