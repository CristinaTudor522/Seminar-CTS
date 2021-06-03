package tudor.cristinaandreea.g1088.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import tudor.cristinaandreea.g1088.clase.Produs;

public class TestProdusCerinta2 {
	
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
	
	@Category(TestRightCategory.class)
	@Test
	public void testAdaugaSaptamanaRight() {
		int nrProduseVandute=7;
		
		assertEquals("Test adaugaSaptamana",produsInitial.getNrProduseVandute(1),nrProduseVandute);
	}
	
	@Category(TestRightCategory.class)
	@Test 
	public void testGetNrProduseVanduteRight() {
		int nrProduseVandute=10;
		
		assertEquals("Test getNrProduseVandute",produsInitial.getNrProduseVandute(2),nrProduseVandute);
	}
	
	@Category(TestRightCategory.class)
	@Test
	public void testGetNrSaptamaniPesteMedieRight() {
		int nrSaptamaniPesteMedie=2;
		int limitaVanzari=8;
		
		assertEquals("Test getNrSaptamaniPesteMedie",produsInitial.getNrSaptamaniPesteMedie(limitaVanzari),nrSaptamaniPesteMedie);
	}
	
	/*
	 * 
	 * mai am de facut Range + Boundary + Ordering + Performanta + 2 la alegere
	 * 
	 */
	

	@Test
	public void testGetNrSaptammaniPesteMedieCardinalityZero() {
		int limita=10;
		
		int nrSaptamaniPesteMedie=0;
		int nrSaptamaniPesteMedieCalculat= produsInitial.getNrSaptamaniPesteMedie(limita);
		assertEquals("Test fara note", nrSaptamaniPesteMedie, nrSaptamaniPesteMedieCalculat);
	}
	
	@Test
	public void testGetNrSaptamaniPesteMedieCardinalityUnu() {
		int limita = 9;
		
		int nrSaptamaniPesteMedie =1;
		int nrSaptamaniPesteMedieCalculat= produsInitial.getNrSaptamaniPesteMedie(limita);
		assertEquals("Test fara note", nrSaptamaniPesteMedie, nrSaptamaniPesteMedieCalculat);
	}

}
