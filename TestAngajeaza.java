package tests;

import java.text.ParseException;
import org.mockito.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import cts.Angajat;
import cts.Firma;
import cts.Intern;
import junit.framework.TestCase;

public class TestAngajeaza extends TestCase {
	
	Firma EJobs;
	Intern intern1;
	Angajat ang;

	public TestAngajeaza(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		Intern i=Mockito.mock(Intern.class,Mockito.RETURNS_DEEP_STUBS);
		Mockito.when(i.getNume()).thenCallRealMethod();
		Mockito.doCallRealMethod().when(i).setNume(Mockito.any(String.class));
		EJobs=Firma.makeFirma("E Jobs");
		try {
			ang=EJobs.creazaFisaPtAngajare("Angajat drepturi depline", i);
			super.setUp();
		}
			catch (Exception e) {
				e.printStackTrace();
			}
		} 
		
		
	

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testAngajeazaNrAng(){
		int nrAng=EJobs.getNrAngajati();
		

		EJobs.angajeaza(ang);
		assertEquals(" Probleme incrementare nr angajati!",nrAng+1,EJobs.getNrAngajati());
		
		
	}
	
	public void testNrAngStruct(){
		int nrAng=EJobs.structura.getStruct().size();
		EJobs.angajeaza(ang);
		assertEquals("Probleme inserare angajat in structura",nrAng+1,EJobs.structura.getStruct().size());
	}
	
	

}
