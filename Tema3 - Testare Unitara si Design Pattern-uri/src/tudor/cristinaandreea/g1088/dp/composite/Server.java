package tudor.cristinaandreea.g1088.dp.composite;

public class Server extends UnitateAbstractaServer{
	
	String adresaIp;
	int port;
	int nrMaximConexiuni = 10;
	
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

