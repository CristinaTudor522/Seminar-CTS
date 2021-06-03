package tudor.cristinaandreea.g1088.dp.prototype;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestServerPrototype {
	
	static Server server =new Server("10.0.0.1", 8001);
	

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
	public void testPrototypeGetAdresaIp() throws CloneNotSupportedException {
		String adresaIp =server.getAdresaIp();
		
		Server copieServer =(Server) server.clone();
		String copieAdresaIp = copieServer.getAdresaIp();
		
		assertEquals("Test prototype cu valori clonate", adresaIp, copieAdresaIp);
	}
	
	@Test
	public void testPrototypeGetPort() throws CloneNotSupportedException {
		int port =server.getPort();
		
		Server copieServer =(Server) server.clone();
		int copiePort = copieServer.getPort();
		
		assertEquals("Test prototype cu valori clonate", port, copiePort);
	}

}
