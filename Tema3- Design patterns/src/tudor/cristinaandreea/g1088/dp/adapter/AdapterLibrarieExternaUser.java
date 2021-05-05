package tudor.cristinaandreea.g1088.dp.adapter;

public class AdapterLibrarieExternaUser extends User{
	
	InterfataUserLibrarieExterna userLE;
	
	public AdapterLibrarieExternaUser(InterfataUserLibrarieExterna userLE) {
		super();
		this.userLE=userLE;
	}

	@Override
	public void aleargaInTimpulLiber() {
		userLE.mergeRepede();
	}

}
