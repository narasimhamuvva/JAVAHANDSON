
public class BuilderExample {
	public static void main(String args[])
	{
		School s=new School();
		s= s.setEnglish(20).setMath(30).build();
		System.out.println("result"+s.average);
	}
	

}
