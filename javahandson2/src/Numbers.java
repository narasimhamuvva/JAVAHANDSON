import java.util.Random;

public class Numbers {
	
public int brucenumber;
public int michealnumber;

public void compare()
{
	Random rand=new Random();
	brucenumber =rand.nextInt(50)+1;
	michealnumber= rand.nextInt(50)+1;
	
	if(brucenumber==michealnumber){
		System.out.println("both got the same number");
	}
	else if(brucenumber>michealnumber){
		System.out.println("bruce won");
	}
	else {
		System.out.println("micheal won");
	}
}
public static void main(String args[]){
Numbers nm=new Numbers();
nm.compare();
}
}
