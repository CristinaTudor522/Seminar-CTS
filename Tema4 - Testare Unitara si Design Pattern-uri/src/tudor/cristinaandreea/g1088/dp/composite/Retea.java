package tudor.cristinaandreea.g1088.dp.composite;

import java.util.ArrayList;

public class Retea extends UnitateAbstractaServer{
	
	ArrayList<UnitateAbstractaServer> unitati= new ArrayList<>();


	@Override
	public String getAdresaIp() {
		for(UnitateAbstractaServer unitate : unitati) {
			return unitate.getAdresaIp();
		}
		return null;
	}

	@Override
	public int getPort() {
		for(UnitateAbstractaServer unitate : unitati) {
			return unitate.getPort();
		}
		return 0;
	}

	@Override
	public int getNrMaximConexiuni() {
		for(UnitateAbstractaServer unitate : unitati) {
			return unitate.getNrMaximConexiuni();
		}
		return 0;
	}

	@Override
	public boolean conectare() {
		for(UnitateAbstractaServer unitate : unitati) {
			unitate.conectare();
		}
		return true;
	}

	@Override
	public boolean deconectare() {
		for(UnitateAbstractaServer unitate : unitati) {
			unitate.deconectare();
		}
		return true;
	}

	@Override
	public void adaugaServer(UnitateAbstractaServer unitate) {
		this.unitati.add(unitate);
	}

	@Override
	public void stergeServer(UnitateAbstractaServer unitate) {
		this.unitati.remove(unitate);
	}

	@Override
	public UnitateAbstractaServer getServer(int index) {
		return this.unitati.get(index);
	}
	
	

}
