package tudor.cristinaandreea.g1088.dp.factory;

public class UserDoctor extends UserAbstract{
	
	String specializare;
	int aniVechime;
	
	public UserDoctor(String nume, String prenume, String specializare) {
		this.nume=nume;
		this.prenume=prenume;
		this.specializare=specializare;
	}

	@Override
	public void merge() {
		System.out.println("Doctorul poate merge!");
	}

	@Override
	public void vorbeste() {
		System.out.println("Doctorul poate vorbi!");
	}

	@Override
	public String toString() {
		return "UserDoctor ["
				+ "nume=" + nume + ","
			    + "prenume=" + prenume + ", "
			    + "specializare=" + specializare + "]";
	}

	
	
}
