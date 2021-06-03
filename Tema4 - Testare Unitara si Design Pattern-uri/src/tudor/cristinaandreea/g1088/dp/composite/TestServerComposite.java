package tudor.cristinaandreea.g1088.dp.composite;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestServerComposite {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
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
	public void testComposite() {
		UnitateAbstractaServer retea1 = new Retea();
		UnitateAbstractaServer retea2 = new Retea();
		
		retea1.adaugaServer(new Server("10.10.0.1", 8001, 20));
		retea1.adaugaServer(new Server("10.0.0.1", 3000, 10));
		
		retea2.adaugaServer(new Server("10.1.1.1", 5000, 30));
		
		UnitateAbstractaServer reteaNivel = new Retea();
		
		reteaNivel.adaugaServer(new Server("10.10.1.1",8000, 100));
		reteaNivel.adaugaServer(retea1);
		reteaNivel.adaugaServer(retea2);
		
		int nrMaximConexiuni = retea1.getNrMaximConexiuni();
		int nrMaximConexiuniCalculat = reteaNivel.getServer(1).getNrMaximConexiuni();
		
		assertEquals("Test composite", nrMaximConexiuni, nrMaximConexiuniCalculat);
	}

}
