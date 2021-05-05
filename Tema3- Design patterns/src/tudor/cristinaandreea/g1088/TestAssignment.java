package tudor.cristinaandreea.g1088;

import java.util.ArrayList;
import java.util.Collection;

import tudor.cristinaandreea.g1088.dp.adapter.AdapterLibrarieExternaUser;
import tudor.cristinaandreea.g1088.dp.adapter.InterfataUserLibrarieExterna;
import tudor.cristinaandreea.g1088.dp.adapter.User;
import tudor.cristinaandreea.g1088.dp.adapter.UserLibrarieExterna;
import tudor.cristinaandreea.g1088.dp.adapter.UserNurse;
import tudor.cristinaandreea.g1088.dp.factory.TipUser;
import tudor.cristinaandreea.g1088.dp.factory.UserAbstract;
import tudor.cristinaandreea.g1088.dp.factory.UserDoctor;
import tudor.cristinaandreea.g1088.dp.factory.UserFactory;
import tudor.cristinaandreea.g1088.dp.factory.UserPatient;
import tudor.cristinaandreea.g1088.dp.proxy.InterfataLogin;
import tudor.cristinaandreea.g1088.dp.proxy.ModulLogin;
import tudor.cristinaandreea.g1088.dp.proxy.ProxyLogin;
import tudor.cristinaandreea.g1088.dp.singleton.ConexiuneBazaDate;
import tudor.cristinaandreea.g1088.dp.singleton.ModulUser;
import tudor.cristinaandreea.g1088.dp.singleton.ProfilUser;

public class TestAssignment {

	public static void main(String[] args) {
		
		System.out.println("---------Test Singleton----------");
		
		ConexiuneBazaDate conexiuneBD1=ConexiuneBazaDate.getConexiune();
		ConexiuneBazaDate conexiuneBD2=ConexiuneBazaDate.getConexiune();
		
		if(conexiuneBD1!=conexiuneBD2) {
			System.out.println("Referintele sunt diferite");
		}
		else {
			System.out.println("Referintele sunt identice");
		}
		
		ModulUser modulUser=new ModulUser();
		ProfilUser profilUser=new ProfilUser();
		
		System.out.println("---------Test Simple Factory----------");
		
		UserAbstract userPatient =UserFactory.getUser(TipUser.PATIENT, "Ghencea", "Niculina", 40);
		UserAbstract userDoctor=UserFactory.getUser(TipUser.DOCTOR,"Tudor","Carmen",60);
		
		System.out.println(userPatient.toString());
		System.out.println(userDoctor.toString());
		
		ArrayList<UserAbstract> users=new ArrayList<>();
		
		System.out.println("---------Test Adapter----------");
		
		ArrayList<User> usersAdapter=new ArrayList<>();
		usersAdapter.add(new UserNurse("Ion", "Andrei", "generalist"));
				
		ArrayList<InterfataUserLibrarieExterna> usersLE=new ArrayList<>();
		usersLE.add(new UserLibrarieExterna());
				
		InterfataUserLibrarieExterna userLE=new UserLibrarieExterna();
		AdapterLibrarieExternaUser adapter=new AdapterLibrarieExternaUser(userLE);
		usersAdapter.add(adapter);
			
		System.out.println(usersAdapter);

		System.out.println("---------Test Proxy----------");
		
		InterfataLogin login = new ModulLogin("10.0.10.10");
		if(login.login("admin", "1234")) {
			System.out.println("Bun venit admin!");
		}
		
		login = new ProxyLogin(login);
		
		String[] parole = new String[] {"12345", "admin1234", "admin","admin12", "1234"};
		for(String parola : parole) {
			if(login.login("admin", parola)) {
				System.out.println("Parola: "+parola+" este gresita!");
			}
		}
		
		System.out.println("Conectarea a esuat!");
		
	}

}

