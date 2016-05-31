package tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cts.Angajat;
import cts.BuilderAngajatDrepturiDepline;
import cts.Intern;
import junit.framework.TestCase;

public class TestSetDataAngajare extends TestCase {
	
	public Angajat angD;

	public TestSetDataAngajare(String name) {
		super(name);
	}

	protected void setUp()  {
		try {
			
			String stringDataNas1 = "1990-01-18";
			Date dataNas1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataNas1);
			angD=new BuilderAngajatDrepturiDepline(2700, 1).setDataAngajare(new Date()).setDataNastere(dataNas1).setNume(" ").setProba().build();
			super.setUp();
		} catch (Exception e) {
		
		}
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSetDataAngViitor() throws ParseException{
		    String stringDataAng = "2017-01-18";
		
			Date dataAng1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataAng);
			try {
				angD.setDataAngajare(dataAng1);
				fail("Metoda setDataAng nu arunca exceptie pe data din viitor!");
			} catch (Exception e) {
				
			}
		
	}
	
	
	public void testSetDataAngNull() {
		String stringDataAng ="2015-01-18";
		String stringDataNas="2015-01-18";
		
		Date dataNas1;
		try {
			dataNas1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataNas);
			angD.setDataNastere(dataNas1);
		} 
		catch(Exception e){
			
		}
		
		try {
			Date dataAng1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataAng);
			angD.setDataAngajare(dataAng1);
			fail("Metoda setDataAng nu arunca exceptie pe data angajare = data nastere!");
		} 
		catch (Exception e) {
			
		}

		
		
		
	}

}
