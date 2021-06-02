package tudor.cristinaandreea.g1088.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import tudor.cristinaandreea.g1088.clase.Produs;
import tudor.cristinaandreea.g1088.exceptii.ExceptieNume;
import tudor.cristinaandreea.g1088.exceptii.ExceptiePret;

public class TestProdusCerinta1 {
	
	static String numeInitial="paine";
	static float pretInitial=1.5f;
	static ArrayList<Integer> produseVanduteSaptamanal= new ArrayList<Integer>();
	
	Produs produsInitial = new Produs(numeInitial,pretInitial);
	Produs produsInitial2 = new Produs(numeInitial,pretInitial, produseVanduteSaptamanal);

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		produseVanduteSaptamanal.add(9);
		produseVanduteSaptamanal.add(7);
		produseVanduteSaptamanal.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Ignore
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	
	@Test
	public void testConstructorParametriiNumePretConformanceRight() throws ExceptieNume, ExceptiePret {
		String numeNou="paine";
		float pretNou=1.5f;
		
		Produs produsNou = new Produs(numeNou,pretNou);
		
		assertEquals("Test constructor cu parametrii nume si pret, numele este corect",produsNou.getName(), produsInitial.getName());
		assertEquals("Test constructor cu parametrii nume si pret, pretul este corect", String.valueOf(produsNou.getPret()), 
				String.valueOf(produsInitial.getPret()));
	}
	
	@Test
	public void testConstructorTotiParametriiConformanceRight() {
		String numeNou="paine";
		float pretNou=1.5f;
		ArrayList<Integer> produseVanduteSaptamanalNou= new ArrayList<Integer>();
		
		produseVanduteSaptamanalNou.add(9);
		produseVanduteSaptamanalNou.add(7);
		produseVanduteSaptamanalNou.add(10);
		
		Produs produsNou = new Produs(numeNou,pretNou,produseVanduteSaptamanalNou);
		
		assertEquals("Test constructor cu toti parametrii, numele este corect",produsNou.getName(), produsInitial2.getName());
		assertEquals("Test constructor cu toti parametrii, pretul este corect", String.valueOf(produsNou.getPret()), 
				String.valueOf(produsInitial2.getPret()));
		assertEquals("Test constructor cu toti parametrii, numarul produselor vandute saptamanal este corect", 
				String.valueOf(produsNou.getNrProduseVandute(0)), String.valueOf(produsInitial2.getNrProduseVandute(0)));
	}
	
	/*
	 *
	 * mai am de facut ErrorCondition + Reference
	 * 
	 * 
	 */
	
	
	@Test
	public void testConstructorTotiParametriiExistance() {
		String numeNou="paine";
		float pretNou=1.5f;
		ArrayList<Integer> produseVanduteSaptamanalNou= new ArrayList<Integer>();
		
		produseVanduteSaptamanalNou.add(9);
		produseVanduteSaptamanalNou.add(7);
		produseVanduteSaptamanalNou.add(10);
		
		Produs produsNou = new Produs(numeNou,pretNou,produseVanduteSaptamanalNou);
		
		assertNotNull("Test existenta produs creat cu ajutorul constructorului", produsNou);
	}
	

	@Test
	public void testSetVanzariExistance() {
		int nrProduseVandute=6;
		
		ArrayList<Integer> produseVanduteSaptamanalNou= new ArrayList<Integer>();
		
		produseVanduteSaptamanalNou.add(5);
		produseVanduteSaptamanalNou.add(6);
		produseVanduteSaptamanalNou.add(6);
		
		produsInitial2.setVanzari(produseVanduteSaptamanalNou);
		
		assertEquals("Test existenta metoda setVanzari",produsInitial2.getNrProduseVandute(2),nrProduseVandute);
	}

}
