package tests;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import cts.Intern;
import junit.framework.TestCase;

public class TestCerereConcediu extends TestCase {
	Intern intern;
	int nrZile=0;
	int rezAst=0;
	int nrZileNeg=0;

	public TestCerereConcediu(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		String stringDataNas1 = "1990-01-18";
		Date dataNas1 = new SimpleDateFormat("yyyy-MM-dd").parse(stringDataNas1);
		intern=new Intern("Popa Alin",dataNas1);
		FileReader fr=new FileReader("input.txt");
		BufferedReader br=new BufferedReader(fr);
		String linie=br.readLine();
		while(linie!=null){
			StringTokenizer sep=new StringTokenizer(linie,"#");
			nrZile=Integer.parseInt(String.valueOf(sep.nextElement()));
			rezAst=Integer.parseInt(String.valueOf(sep.nextElement()));
			nrZileNeg=Integer.parseInt(String.valueOf(sep.nextElement()));
			linie=br.readLine();
			}
		br.close();
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCerereConcediuValNormala(){
		System.out.println("nr zile:"+nrZile);
		System.out.println("rezAst:"+rezAst);
		System.out.println("nr zile neg:"+nrZileNeg);
		
		try {
			intern.pontaj(24);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			intern.cerereConcediu(nrZile);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals("Probleme cerere concediu val normale",intern.nrOre,rezAst);
	}
	
	
	public void testCerereConcediuValNeg(){
		try {
			intern.cerereConcediu(nrZileNeg);
			fail("Metoda nu arunca exceptie pe nr zile concediu negativ!");
		} catch (Exception e) {
			
		}
		
	}
	
	

}
