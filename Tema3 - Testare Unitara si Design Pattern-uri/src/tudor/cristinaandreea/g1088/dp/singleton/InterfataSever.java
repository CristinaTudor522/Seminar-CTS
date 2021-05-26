package tudor.cristinaandreea.g1088.dp.singleton;

public interface InterfataSever {

	    public String getAdresaIp();
	    public int getPort();
	    public int getNrMaximConexiuni();

	    public boolean conectare();
	    public boolean deconectare();

}
