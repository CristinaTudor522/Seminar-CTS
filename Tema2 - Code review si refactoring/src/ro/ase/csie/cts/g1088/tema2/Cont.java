package ro.ase.csie.cts.g1088.tema2;

public class Cont {
	
	double	valoareImprumut;
	double rataDobanda;	
	int	perioada;
	String tipCont;
	
	public static final int NR_ZILE_MAXIM=365;
	public static final int NR_LUNI_MAXIM=12;
	public static final double PROCENT_COMISION=0.0125;
	
	public Cont(double valoare, double rata, String tip_cont) throws ExceptieValoareInvalida {
		if(valoare < 0) {
			throw new ExceptieValoareInvalida("Atentie, valoarea introdusa trebuie sa fie pozitiva !");
		}
		else
		{
			this.valoareImprumut = valoare;
		}
		this.rataDobanda = rata;
		this.tipCont= tip_cont;
	}
	
	public double getValoareImprumut() {
		return this.valoareImprumut;
	}
	
	public double getRataDobanda() {
		return this.rataDobanda;
	}
	
	public double getRataDobandaLunara() {
		return this.rataDobanda/NR_LUNI_MAXIM;
	}
	
	public void setValoareImprumut(double valoare) throws ExceptieValoareInvalida{
		if(valoare < 0) {
			throw new ExceptieValoareInvalida("Atentie, valoarea introdusa trebuie sa fie pozitiva !");
		}
		else
		{
			this.valoareImprumut = valoare;
		}
	}
	
	public static double calculeazaComision(Cont[] conturi) {
		double comisionTotal = 0.0;
		for	(int  i=0;i<conturi.length;i++) {
			if(conturi[i].tipCont.equals(TipCont.PREMIUM)||conturi[i].tipCont.equals(TipCont.SUPER_PREMIUM)) {
				comisionTotal+=PROCENT_COMISION	* 
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