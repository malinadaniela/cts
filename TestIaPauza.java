package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import cts.Intern;
import junit.framework.TestCase;

public class TestIaPauza extends TestCase {
	
	Intern intern1;

	public TestIaPauza(String name) {
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
	
	
	public void testPauzaNegativ(){
		int orePauza=-3;
		try {
			intern1.iaPauza(orePauza);
			fail("Metoda iaPauza() nu arunca exceptii pe nr de ore negativ!");
		} catch (Exception e) {
			
		}
		
	}
	
	public void testNrOrePauzaMaiMareNrOreLucrate(){
		try {
			intern1.pontaj(5);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int orePauza=7;
		
			try {
				intern1.iaPauza(orePauza);
				fail("Metoda iaPauza() nu arunca exceptie pe nr de ore de pauza mai mic decat nr de ore lucrate!");
			} catch (Exception e) {
				
			}
			
		
	}

}
