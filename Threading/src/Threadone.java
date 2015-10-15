
public class Threadone extends Thread {
	
	SharedThread s;
	  
	Threadone(SharedThread s){ 
		this.s=s;
	  
	}  
	public void run(){ 
		s.calc(10);
	 
	}  

}
