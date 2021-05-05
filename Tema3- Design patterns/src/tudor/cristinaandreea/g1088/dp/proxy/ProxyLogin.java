package tudor.cristinaandreea.g1088.dp.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxyLogin implements InterfataLogin {
	
	InterfataLogin modulLogin;
	public static int NR_MAXIM_INCERCARI=3;
	Map<String, Integer> utilizatori = new HashMap<>(); 
	
	public ProxyLogin(InterfataLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	@Override
	public boolean login(String username, String password) {
		Integer nrIncercari = utilizatori.get(username);
		if(nrIncercari == null) {
			utilizatori.put(username, 0);
			nrIncercari = 0;
		}
		
		if(nrIncercari >= NR_MAXIM_INCERCARI) {
			return false;
		}
		
		if(modulLogin.login(username, password)) {
			utilizatori.put(username, 0);
			return true;
		}
		else {
			nrIncercari += 1;
			utilizatori.put(username, nrIncercari);
			if(nrIncercari == NR_MAXIM_INCERCARI) {
				System.out.println("Ati depasit numarul maxim de incercari! Va rugam reveniti mai tarziu!");
			}
			return false;
		}
	}

	@Override
	public boolean verificaStatusServer() {
		return modulLogin.verificaStatusServer();
	}

}
