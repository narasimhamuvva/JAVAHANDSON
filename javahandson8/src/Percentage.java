
import java.util.Scanner;
public class Percentage {
	
	
	public  void calculation(int mmarks,int emarks,int hmarks,int smarks,int somarks,int total)
	{
		int gmarks;
		double percentage;
		gmarks=mmarks+emarks+hmarks+smarks+somarks;
		percentage=((gmarks*100)/total);
	   System.out.println("percentage="+percentage);
	   if(percentage<40)
	   {
		   System.out.println("poor");
	   }
	   
	   else if(percentage>40 && percentage<=59)
	   {
		   System.out.println("average");
	   }
	   
	   else if(percentage>59 && percentage<=79)
	   {
		   System.out.println("good");
	   }
	   
	   else if(percentage>79 && percentage<=89)
	   {
		   System.out.println("verygood");
	   }
	   else 
	   {
		   System.out.println("excellent");
	   }
	   
	   }
	
	public static void main(String args[]){
		
		Percentage pe=new Percentage();
		
        Scanner sc = new Scanner(System.in);
        int mmarks;int emarks;int hmarks;int smarks;int somarks;int total;
        boolean decide;
        System.out.println("Enter all marks btween 0 -100 ");
		System.out.println("Enter mathematics marks : ");
		mmarks = sc.nextInt();
		if(mmarks<0 || mmarks>100)
		{
			System.out.println("Please Enter mathematics marks again : ");
			mmarks = sc.nextInt();	
		}
		System.out.println("Enter english  marks : ");
		emarks = sc.nextInt();
		if(emarks<0 || emarks>100)
		{
			System.out.println("Please Enter english marks again : ");
			emarks = sc.nextInt();	
		}
		System.out.println("Enter hindi marks : ");
		hmarks = sc.nextInt();
		if(hmarks<0 || hmarks>100)
		{
			System.out.println("Please Enter hindi marks again : ");
			hmarks = sc.nextInt();	
		}
		System.out.println("Enter science marks : ");
		smarks = sc.nextInt();
		if(smarks<0 || smarks>100)
		{
			System.out.println("Please Enter science marks again : ");
			smarks = sc.nextInt();	
		}
		System.out.println("Enter social marks : ");
		somarks = sc.nextInt();
		if(somarks<0 || somarks>100)
		{
			System.out.println("Please Enter social marks again : ");
			somarks = sc.nextInt();	
		}
		System.out.println("Enter total marks : ");
		total = sc.nextInt();
		System.out.println("you want to caluculate percentage : ");
		decide = sc.nextBoolean();
		if(decide==true)
		{
		pe.calculation(mmarks,emarks,hmarks,smarks,somarks,total);
		}
		else
		{
			System.exit(0);
		}
		}

	}


