package tudor.cristinaandreea.g1088.dp.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Server implements Cloneable, InterfataSever{
	
	String adresaIp;
	int port;
	int nrMaximConexiuni = 10;
	ArrayList<Integer> retea = null;
	
	private static Server server = null;
	
	private Server() {
		
	}

	public Server(String adresaIp, int port) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.adresaIp = adresaIp;
		this.port = port;
		
		Random random = new Random();
		retea = new ArrayList<>();
		for(int i=0; i<nrMaximConexiuni; i++) {
			retea.add(random.nextInt(1000));
		}
		
	}
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append("Retea server : ");
		for(int punctRetea : this.retea) {
			sb.append(punctRetea + " | ");
		}
		return sb.toString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		Server copieServer = new Server();
		copieServer.adresaIp = this.adresaIp;
		copieServer.port = this.port;
		copieServer.nrMaximConexiuni = this.nrMaximConexiuni;
		copieServer.retea = (ArrayList<Integer>) this.retea.clone();
		
		return copieServer;
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
		return this.getNrMaximConexiuni();
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

