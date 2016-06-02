package tests;


import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class TestSuiteApp extends TestCase {

	public static Test suite(){
		
		TestSuite testSuiteApp=new TestSuite();
		testSuiteApp.addTest(new TestSalariu("testSetSalariuDrepturiDeplineValNegative"));
		testSuiteApp.addTestSuite(TestAplicaAvansare.class);
		testSuiteApp.addTestSuite(TestSetBanda.class);
		
		return testSuiteApp;
		
	}

}
