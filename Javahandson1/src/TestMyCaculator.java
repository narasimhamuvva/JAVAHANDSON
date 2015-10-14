import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TestMyCaculator {
	Calculator calc;
	@Before
	public void setup()
	{
		calc=new Calculator();
	}

	@Test
	public void test() {
		int result=calc.add(2,2);
		assertEquals(result,4);
		result=calc.add(3,5);
		assertEquals(result,8);
	}
	@Test
	public void testdivision() {
		int result=calc.divide(4,2);
		assertEquals(result,4);
	}
	@After
	public void teardown()
	{
		
	}
}
