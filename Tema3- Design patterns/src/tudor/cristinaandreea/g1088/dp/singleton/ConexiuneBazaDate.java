package tudor.cristinaandreea.g1088.dp.singleton;

public class ConexiuneBazaDate {

	String adresaIP;
	String denumireBD;
	
	private static ConexiuneBazaDate conexiuneBD=null;
	
	private ConexiuneBazaDate() {
		
	}

	private ConexiuneBazaDate(String adresaIP, String denumireBD) {
		System.out.println("Apel constructor cu parametrii");
		this.adresaIP = adresaIP;
		this.denumireBD = denumireBD;
	}
		
	public static synchronized ConexiuneBazaDate getConexiune() {
		if(conexiuneBD==null) {
			conexiuneBD=new ConexiuneBazaDate("10.0.5.10","medical-app");
		}
		return conexiuneBD;
		}
	}
	

