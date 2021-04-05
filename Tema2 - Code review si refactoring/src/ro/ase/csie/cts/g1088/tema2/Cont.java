package ro.ase.csie.cts.g1088.tema2;

public class Cont {
	
	double	valoareImprumut,rata;	
	int	zileActiv;
	
	String tipCont;
	
	public static final int NR_ZILE_MAXIM=365;
	public static final int NR_LUNI_MAXIM=12;
	
	public Cont(double valoare, double rata, String tip_cont) throws ExceptieValoareInvalida {
		if(valoare < 0) {
			throw new ExceptieValoareInvalida();
		}
		else
		{
			this.valoareImprumut = valoare;
		}
		this.rata = rata;
		this.tipCont= tip_cont;
	}
	
	public double getValoareImprumut() {
		return this.valoareImprumut;
	}
	
	public double getRata() {
		return this.rata;
	}
	
	public double getRataLunara() {
		return this.rata/NR_LUNI_MAXIM;
	}
	
	public void setValoareImprumut(double valoare) throws ExceptieValoareInvalida{
		if(valoare < 0) {
			throw new ExceptieValoareInvalida();
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
				comisionTotal+=.0125	* 
				(conturi[i].valoareImprumut * Math.pow
						(conturi[i].rata,(conturi[i].zileActiv/NR_ZILE_MAXIM)) - conturi[i].valoareImprumut);	
			}
		}
		return	comisionTotal;
	}
	
	public void afiseaza() {
		System.out.println("Acesta este un cont bancar! ");
	}

	@Override
	public String toString() {
		return "Imprumut: " 
				+ this.valoareImprumut + "; "
				+ "rata: "
				+ this.rata+ "; "
				+ "zile active:"
				+ this.zileActiv+ ";"
				+ "tip: "
				+ this.tipCont+ ";";
	}
	
}