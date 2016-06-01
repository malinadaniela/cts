package tests;

import java.text.SimpleDateFormat;
import java.util.Date;

import cts.Angajat;
import cts.AngajatDrepturiDepline;
import cts.Firma;
import cts.Intern;
import junit.framework.TestCase;

public class TestAplicaAvansare extends TestCase {
	Firma BestMotors;
	Intern intern1;
	AngajatDrepturiDepline ang1;

	public TestAplicaAvansare(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		BestMotors=Firma.makeFirma("Best Motors");
		String stringDataNas1 = "1990-01-18";
		Date dataNas1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataNas1);
		intern1=new Intern("Popa Alin",dataNas1);
		ang1=(AngajatDrepturiDepline)BestMotors.incheiereContract("Angajat drepturi depline",intern1);
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testAplicaAvansareSalariu(){
		float salariuInit=ang1.getSalariu();
		ang1.aplicaAvansare();
		float salariuMarit=ang1.getSalariu();
		assertEquals("Probleme marire salariu!",salariuInit+750,salariuMarit);
		
	}
	
	public void testAplicaAvansareBanda(){
		int banda=ang1.getBanda();
		ang1.aplicaAvansare();
		assertEquals("Probleme avansare banda!", banda+1, ang1.getBanda());
		
	}

}
