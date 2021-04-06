package ro.ase.csie.cts.g1088.tema2.module;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptiePerioadaInvalida;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieRataInvalida;
import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieValoareInvalida;

public interface InterfataValidare {

	public void validareValoareImprumut(double valoare) throws ExceptieValoareInvalida;
	public void validareRataDobanda(double rata) throws ExceptieRataInvalida;
	public void validarePerioada(int perioada) throws ExceptiePerioadaInvalida;
}
