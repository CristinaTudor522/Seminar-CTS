package tudor.cristinaandreea.g1088.dp.factory;

public class UserPatient extends UserAbstract{
	
	String adresa;
	boolean esteBolnav;
	
	public UserPatient(String nume, String prenume, int varsta, boolean esteBolnav) {
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
		this.esteBolnav=esteBolnav;
	}

	@Override
	public void merge() {
		System.out.println("Pacientul poate merge!");
	}

	@Override
	public void vorbeste() {
		System.out.println("Pacientul poate vorbi!");
	}

	@Override
	public String toString() {
		return "UserPatient ["
				+ "nume=" + nume + ", "
				+ "prenume=" + prenume + ", "
				+ "esteBolnav="+esteBolnav+"]";
	}
	
	
	
	

}
