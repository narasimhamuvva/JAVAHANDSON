import junit.framework.TestCase;

import org.junit.Test;


public class UnitTesting extends TestCase {
	Shark s = new Shark();
	/*protected void setUp()
	{
		s  = new Shark();
	}*/
	
	@Test
	public void test() {
		
		assertEquals(s.kind, "Shark");
	
	}

}
