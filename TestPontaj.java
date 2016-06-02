package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import cts.Intern;
import junit.framework.TestCase;

public class TestPontaj extends TestCase {
	
	public Intern intern1;

	public TestPontaj(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		String stringDataNas1 = "1990-01-18";
		Date dataNas1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataNas1);
		intern1=new Intern("Popa Alin",dataNas1);
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testPontajValoareNormala(){
		int oreInit=intern1.nrOre;
		int nrOre=8;
		try {
			intern1.pontaj(nrOre);
		} catch (Exception e) {
			
		}
		assertEquals("test pontaj() valoare normala", oreInit+nrOre, intern1.nrOre);
		
	}
	
	public void testPontajValNeg(){
		int nrOre=-5;
		try {
			intern1.pontaj(nrOre);
			fail("Metoda nu arunca exceptii pe nr de ore negativ!");
		} catch (Exception e) {
			
		}
	}

}
