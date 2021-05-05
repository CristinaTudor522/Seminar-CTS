package tudor.cristinaandreea.g1088.dp.adapter;

public class UserNurse extends User{
	
	String tip;
	
	public UserNurse(String nume, String prenume,String tip) {
		this.nume=nume;
		this.prenume=prenume;
		this.tip=tip;
		
	}

	@Override
	public void aleargaInTimpulLiber() {
		System.out.println("Utilizatorul asistent alearga in timpul liber!");
		
	}

	@Override
	public String toString() {
		return "UserNurse ["
				+ "nume=" + nume + ", "
				+ "prenume=" + prenume + ", "
				+ "tipAsistent=" + tip +
				"]";
	}
	
	

}
