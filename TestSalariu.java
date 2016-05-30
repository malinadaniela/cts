package tests;

import java.util.Date;

import cts.AngajatContractat;
import cts.AngajatDrepturiDepline;
import cts.BuilderAngajatContractat;
import cts.BuilderAngajatDrepturiDepline;
import junit.framework.TestCase;
import junit.*;

public class TestSalariu extends TestCase {
	BuilderAngajatContractat buildAC;
	AngajatContractat ang;
	BuilderAngajatDrepturiDepline buildADD;
	AngajatDrepturiDepline ang2;

	public TestSalariu(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		buildAC=new BuilderAngajatContractat("",2300);
		ang=buildAC.setDataAng(new Date()).setDataNastere(new Date()).setNume("").build();
		buildADD=new BuilderAngajatDrepturiDepline(2300,1);
		ang2=buildADD.setDataAngajare(new Date()).setDataNastere(new Date()).setNume("").build();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testSetSalariuContractorValoareNormala(){
		float sal=3000;
		ang.setSalariu(sal);
		assertEquals("Probleme set salariu valori normale contractor",sal,ang.getSalariu());
		
		
	}
	
	public void testSetSalariuDrepturiDeplineValNegative(){
		try {
			ang2.setSalariu(-2000);
			fail("Metoda nu arunca exceptii pe valori negative ale salariului!");
		} catch (Exception e) {
			
		}
		
	}
	
	
	public void testSetSalariuZero(){
		try {
			ang2.setSalariu(0);
			fail("metoda nu arunca exceptii pe valori nule ale salariului");
		} catch (Exception e) {
			
		}
		
	}

}
