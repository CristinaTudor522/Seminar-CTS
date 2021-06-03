package tudor.cristinaandreea.g1088.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import tudor.cristinaandreea.g1088.clase.Produs;

public class TestProdusCerinta3 {

	static String numeInitial="paine";
	static float pretInitial=1.5f;
	static ArrayList<Integer> produseVanduteSaptamanal= new ArrayList<Integer>();
	
	Produs produsInitial = new Produs(numeInitial,pretInitial, produseVanduteSaptamanal);

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
	public void testGetProcentSaptamaniSlabeRight() {
		produsInitial.setVanzari(produseVanduteSaptamanal);
		
		int limita=9;
		
		int procentNou=33;
		int procentCalculat=produsInitial.getProcentSaptamaniSlabe(limita);
		
		assertEquals("Test getProcentSaptamaniSlabe",procentCalculat,procentNou);
	}
	
	@Test
	public void testGetIndexSaptamaniCuVanzariMaxime() {
		produsInitial.setVanzari(produseVanduteSaptamanal);
		
		ArrayList<Integer> saptamaniNoi=new ArrayList<Integer>(Arrays.asList(2));
		ArrayList<Integer> saptamaniCalculate=produsInitial.getIndexSaptamaniCuVanzariMaxime();
	
	    assertArrayEquals("Test getIndexSaptamaniVanzariMaxime",saptamaniCalculate.toArray(),saptamaniNoi.toArray());
	}
	
	/*
	 * 
	 * sa nu uit Cross-Check + InverseRelationship + 2 la alegere
	 *
	 */

}
