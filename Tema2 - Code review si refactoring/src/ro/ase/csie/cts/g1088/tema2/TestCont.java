package ro.ase.csie.cts.g1088.tema2;

public class TestCont {

	public static void main(String[] args) {

		try {
			System.out.println("---------------------Contul 1--------------------");
			Cont cont1 = new Cont(1500.75, 50.2, "PREMIUM");
			System.out.println("Valoarea imprumutului este "+cont1.getValoareImprumut());
			System.out.println("Rata dobanzii este "+cont1.getRataDobanda());
			System.out.println("Rata lunara a dobanzii este "+cont1.getRataDobandaLunara());
			
			System.out.println("---------------------Contul 2--------------------");
			Cont cont2= new Cont(15,4,"STANDARD");
			cont2.setValoareImprumut(400.5);
			System.out.println("Valoarea imprumutului este  " + cont2.getValoareImprumut());
			
		} catch (ExceptieValoareInvalida e) {
			e.printStackTrace();
		}
	}

}
