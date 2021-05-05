package tudor.cristinaandreea.g1088.dp.factory;

public class UserFactory {
	
	public static UserAbstract getUser(TipUser tip, String nume,String prenume,int varsta) {
		
		UserAbstract user = null;
		
		switch(tip) {
		case PATIENT:
			user=new UserPatient("Tudor", "Cristina", 22, false);
			break;
		case DOCTOR:
			user=new UserDoctor("Chirita", "Mihai", "medicina de familie");
			break;
		default:
			throw new UnsupportedOperationException();
		}
		return user;
	}
}
