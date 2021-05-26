package tudor.cristinaandreea.g1088.dp.composite;

import java.util.ArrayList;

public class Retea extends UnitateAbstractaServer{
	
	ArrayList<UnitateAbstractaServer> unitati= new ArrayList<>();


	@Override
	public String getAdresaIp() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getPort() {
		throw new UnsupportedOperationException();
	}

	@Override
	public int getNrMaximConexiuni() {
		throw new UnsupportedOperationException();
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
