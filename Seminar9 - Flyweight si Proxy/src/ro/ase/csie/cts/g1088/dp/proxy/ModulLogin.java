package ro.ase.csie.cts.g1088.dp.proxy;

public class ModulLogin implements InterfataLogin{

	String ipSerger;
	
	public ModulLogin(String ipSerger) {
		super();
		this.ipSerger = ipSerger;
	}

	@Override
	public boolean login(String user, String pass) {
		if(user.equals("admin") && pass.equals("root1234")) {
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
