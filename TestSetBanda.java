package tests;

import java.util.Date;

import cts.AngajatDrepturiDepline;
import cts.BuilderAngajatDrepturiDepline;
import junit.framework.TestCase;

public class TestSetBanda extends TestCase {
	public AngajatDrepturiDepline angD;

	public TestSetBanda(String name) {
		super(name);
	}

	protected void setUp(){
		
		try {
			angD=new BuilderAngajatDrepturiDepline(2700, 1).setDataAngajare(new Date()).setDataNastere(new Date()).setNume(" ").setProba().build();
			super.setUp();
		} catch (Exception e) {
			
		}
		
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testSetBandaZero(){
		
		try {
			angD.setBanda(0);
			fail("Metoda setBanda() nu arunca exceptie atunci cand primeste valoarea 0!");
		} catch (Exception e) {
			
		}
	}
	
	public void testSetBandaValoarePesteLimita(){
		try {
			angD.setBanda(16);
			fail("Metoda setBanda() nu arunca exceptie atunci cand banda este mai mare decat 15!");
		} catch (Exception e) {
			
		}
		
	}
	
	
	

}
