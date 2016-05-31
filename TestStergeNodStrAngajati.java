package tests;

import java.util.ArrayList;

import cts.NodIerarhie;
import cts.StructuraAngajati;
import junit.framework.TestCase;

public class TestStergeNodStrAngajati extends TestCase {
	public StructuraAngajati struct;
	public ArrayList<NodIerarhie> listaAng;
	public NodIerarhie nod;
	

	public TestStergeNodStrAngajati(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		struct=new StructuraAngajati();
		listaAng=new ArrayList<>();
		struct.setStruct(listaAng);
		nod=null;
		
		super.setUp();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testRemoveStructVida(){
		
		try {
			struct.stergeNod(nod);
			fail("stergeNod nu arunca exceptie atunci cand lista e vida!");
		} catch (Exception e) {
			
		}
		
		
	}
	
	public void testRemoveNodInexistent(){
		struct.adaugaNod(nod);
		NodIerarhie nod2=new StructuraAngajati();
		try {
			struct.stergeNod(nod2);
			fail("stergeNod nu arunca exceptie atunci cand se incearca stergerea unui nod inexistent!");
		} catch (Exception e) {
			
		}
	}
	
	

}
