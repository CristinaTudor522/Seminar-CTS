package tudor.cristinaandreea.g1088.dp.composite;

public class Server extends UnitateAbstractaServer{
	
	String adresaIp;
	public int port;
	int nrMaximConexiuni;
	
	public Server(String adresaIp, int port, int nrMaximConexiuni) {
		super();
		this.adresaIp = adresaIp;
		this.port = port;
		this.nrMaximConexiuni = nrMaximConexiuni;
	}

	@Override
	public String getAdresaIp() {
		return this.adresaIp;
	}
	
	@Override
	public int getPort() {
		return this.port;
	}
	
	@Override
	public int getNrMaximConexiuni() {
		return this.nrMaximConexiuni;
	}
	
	@Override
	public boolean conectare() {
		System.out.println(String.format("Serverul cu adrea IP %s se conecteaza!", adresaIp));
		return true;
	}
	
	@Override
	public boolean deconectare() {
		System.out.println(String.format("Serverul cu adrea IP %s se deconecteaza!", adresaIp));
		return true;
	}
	
}	

