package tests;

import cts.Firma;
import junit.framework.TestCase;

public class TestSetDenumireFirma extends TestCase {
	
	public Firma f;

	public TestSetDenumireFirma(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		f=Firma.makeFirma("YourEmployer");
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetDenFirmaValNormale(){
		
		try {
			f.setDenumire("Firma");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Probleme setDenumire pt valori normale ","Firma",f.getDenumire());
	}
	
	
	public void testSetDenFirmaSirVid(){
		try {
			f.setDenumire("");
			fail(" setDenumire nu arunca exceptie pt sir vid!");
		} catch (Exception e) {
			
		}
		
		
	}
	
	
	public void testSetDenFirmaLungime(){
		try {
			f.setDenumire(" ");
			fail("Metoda permite setarea numelui cu 1 caracter!");
		} catch (Exception e) {
			
		}
	}
	

}
