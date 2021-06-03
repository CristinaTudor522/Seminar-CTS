package tudor.cristinaandreea.g1088.dp.singleton;

public class Server {
	
	String adresaIp;
	int port;
	int nrMaximConexiuni;
	
	private static Server server = null;
	
	private Server() {
		
	}

	private Server(String adresaIp, int port, int nrMaximConexiuni) {
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrMaximConexiuni = nrMaximConexiuni;
	}
	
	public static synchronized Server getServer() {
		if(server == null) {
			server=new Server("10.0.5.10",3001, 10);
		}
		return server;
		}
	
}	

