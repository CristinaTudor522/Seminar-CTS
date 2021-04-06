package ro.ase.csie.cts.g1088.tema2;

import java.util.ArrayList;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptiePerioadaInvalida;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieRataInvalida;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieValoareInvalida;
import ro.ase.csie.cts.g1088.tema2.module.ModulValidare;

public class TestCont {

		public static ArrayList<Object> module =new ArrayList<>();
		
		public void start() {
			ro.ase.csie.cts.g1088.tema2.module.InterfataValidare modulValidare = new ModulValidare();
			module.add(modulValidare);
		}
		
		public static void main(String[] args) {
		
			Cont cont =new Cont (new ModulValidare(), TipCont.PREMIUM);
			
			cont.valoareImprumut = 7500.8;
			cont.rataDobanda = 5.2;
			cont.perioada =700;
			
			System.out.println("---------------------Informatii despre cont--------------------");
			System.out.println("Valoarea imprumutului este "+cont.getValoareImprumut());
			System.out.println("Rata dobanzii este "+cont.getRataDobanda());
			System.out.println("Rata totala a dobanzii este "+cont.getRataDobandaTotala());
			System.out.println("Rata lunara a dobanzii este "+cont.getRataDobandaLunara());
	}

}
