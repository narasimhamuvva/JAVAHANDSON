import junit.framework.TestCase;

import org.junit.Test;


public class Unittest extends TestCase {
	Switchclass s = new Switchclass();

	
	@Test
	public void test() {
		assertEquals(s.display(1), "you have selected card 1");
		
	
	}

}

