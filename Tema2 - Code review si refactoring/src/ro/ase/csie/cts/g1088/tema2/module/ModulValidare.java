package ro.ase.csie.cts.g1088.tema2.module;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptiePerioadaInvalida;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieRataInvalida;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieValoareInvalida;

public class ModulValidare implements InterfataValidare{

		@Override
		public void validareValoareImprumut(double valoare) throws ExceptieValoareInvalida {
			if(valoare < 0) {
				throw new ExceptieValoareInvalida("Valoarea introdusa este invalida!");
			}
			
		}

		@Override
		public void validareRataDobanda(double rata) throws ExceptieRataInvalida {
			if(rata < 0 ) {
				throw new ExceptieRataInvalida("Rata introdusa este invalida");
			}
			
		}

		@Override
		public void validarePerioada(int perioada) throws ExceptiePerioadaInvalida {
			if(perioada < 0) {
				throw new ExceptiePerioadaInvalida("Perioada introdusa este invalida");
			}
			
		}

}
