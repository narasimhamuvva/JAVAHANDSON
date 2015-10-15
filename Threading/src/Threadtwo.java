
public class Threadtwo {
	SharedThread s;
	  
	Threadtwo(SharedThread s){ 
		this.s=s;
	  
	}  
	public void run(){ 
		s.calc(100);
	 
	}
	
}
