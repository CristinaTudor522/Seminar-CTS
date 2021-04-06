package ro.ase.csie.cts.g1088.tema2;

import ro.ase.csie.cts.g1088.tema2.exceptii.ExceptieValoareInvalida;
import ro.ase.csie.cts.g1088.tema2.module.InterfataValidare;

public class Cont {
	
	double	valoareImprumut;
	double rataDobanda;	
	int	perioada;
	TipCont tipCont;
	
	public static final int NR_ZILE_MAXIM = 365;
	public static final double PROCENT_BROKER = 0.0125;
	public static final int NR_LUNI_MAXIM = 12;
	
	InterfataValidare modulValidare = null;
	
	public Cont() {

	}

	public Cont(InterfataValidare valoare, TipCont tip_cont) {
		if(valoare == null) {
			throw new NullPointerException();
		}
		else {
			this.modulValidare = valoare;
		}
		this.tipCont= tip_cont;
	}
	
	public double getValoareImprumut() {
		return this.valoareImprumut;
	}
	
	public double getRataDobanda() {
		return this.rataDobanda;
	}
	
	public double getRataDobandaTotala() {
		return this.valoareImprumut*this.rataDobanda;
	}
	
	public double getRataDobandaLunara() {
		return getRataDobandaTotala()/ NR_LUNI_MAXIM;
	}
	
	public void setValoareImprumut(double valoare) throws ExceptieValoareInvalida{
		if(valoare < 0) {
			throw new ExceptieValoareInvalida("Atentie, valoarea introdusa trebuie sa fie pozitiva!");
		}
		else
		{
			this.valoareImprumut = valoare;
		}
	}
	
	public static double calculeazaComisionTotal(Cont[] conturi) {
		double comisionTotal = 0.0;
		for	(int  i=0;i<conturi.length;i++) {
			if(conturi[i].tipCont.equals(TipCont.PREMIUM)||conturi[i].tipCont.equals(TipCont.SUPER_PREMIUM)) {
				comisionTotal+=PROCENT_BROKER* 
				(conturi[i].valoareImprumut * Math.pow
						(conturi[i].rataDobanda,(conturi[i].perioada/NR_ZILE_MAXIM)) - conturi[i].valoareImprumut);	
			}
		}
		return	comisionTotal;
	}

	@Override
	public String toString() {
		return "Imprumut: " 
				+ this.valoareImprumut + "; "
				+ "rataDobanda: "
				+ this.rataDobanda+ "; "
				+ "perioada: "
				+ this.perioada+ ";"
				+ "tip: "
				+ this.tipCont+ ";";
	}
	
}