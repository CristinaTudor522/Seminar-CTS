package tudor.cristinaandreea.g1088.dp.proxy;

public class ModulLogin implements InterfataLogin{

	String adresaIP;
	
	public ModulLogin(String adresaIP) {
		super();
		this.adresaIP=adresaIP;
	}

	@Override
	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("1234")) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		return true;
	}
	
}
