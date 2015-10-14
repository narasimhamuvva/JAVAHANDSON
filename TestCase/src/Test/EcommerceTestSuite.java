package Test;

import junit.framework.Test;
import junit.framework.TestSuite;

public class EcommerceTestSuite {
	public static Test suite()
	{
		TestSuite suite=new TestSuite();
		suite.addTestSuite(ShoppingCartTest.class);
		suite.addTest(CreditCardTestSuite.suite());
		return suite;
	}
	public static void main(String args[])
	{
		junit.textui.TestRunner.run(suite());
	}

}
