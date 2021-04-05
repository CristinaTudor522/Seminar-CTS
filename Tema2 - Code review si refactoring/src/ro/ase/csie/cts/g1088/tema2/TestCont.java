package ro.ase.csie.cts.g1088.tema2;

public class TestCont {

	public static void main(String[] args) {

		try {
			Cont cont1 = new Cont(1500.75, 50.2, "PREMIUM");
			cont1.afiseaza();
			System.out.println("Valoarea imprumutului este "+cont1.getValoareImprumut());
			System.out.println("Rata este "+cont1.getRata());
			System.out.println("Rata lunara este "+cont1.getRataLunara());
			
			System.out.println("----------------------------------------");
			Cont cont2= new Cont(15,4,"STANDARD");
			cont2.setValoareImprumut(400.5);
			System.out.println("Valoarea imprumutului este  " + cont2.getValoareImprumut());
			
		} catch (ExceptieValoareInvalida e) {
			e.printStackTrace();
		}
	}

}
