package tudor.cristinaandreea.g1088.clase;

import java.util.ArrayList;

import tudor.cristinaandreea.g1088.exceptii.ExceptieNume;
import tudor.cristinaandreea.g1088.exceptii.ExceptiePret;

/*
 * 
 * DISCLAIMER
 * 
 * Cele mai multe dintre metodele date au bug-uri si greseli de implementare
 * 
 * 
 * SPECS
 * 
 * nume - intre 5 si 200 caractere alfa-numerice (fara caractere speciale)
 * pret - intre [0.01, 100000)
 * valori in produseVanduteSaptamanal - intre [0, 1000]
 * 
 * 
 */

public class Produs {
	
	public static final int MIN_PRODUSE_VANDUTE_SAPTAMANAL=0;
	
	private String nume;
	private float pret;
	private ArrayList<Integer> produseVanduteSaptamanal;		//numar de produse vandute in fiecare saptamana
	
	public Produs(String nume, float pret){
		this.nume = nume;
		this.pret = pret;
		this.produseVanduteSaptamanal = new ArrayList<Integer>();
	}

	public Produs(String nume, float pret, ArrayList<Integer> produseVandute) {
		this.nume = nume;
		this.pret = pret;
		this.produseVanduteSaptamanal = new ArrayList<Integer>();
		for(Integer n: produseVandute)
			this.produseVanduteSaptamanal.add(n);
	}
	
	public void setVanzari(ArrayList<Integer> produseVandute) {
		this.produseVanduteSaptamanal = produseVandute;
	}

	public String getName() {
		return this.nume;
	}
	
	public float getPret() {
		return this.pret;
	}
	
	public void adaugaSaptamana(int produseVandute){
		this.produseVanduteSaptamanal.add(produseVandute);
	}
	
	public int getNrProduseVandute(int i){
		return this.produseVanduteSaptamanal.get(i);
	}
	
	/*
	 * 
	 * 
	 * determina numarul de saptamani in care au fost vandute un numar de produse peste limita data
	 * 
	 */
	public int getNrSaptamaniPesteMedie(int limita){
		int nrSaptamani = 0;
		for(int n: this.produseVanduteSaptamanal) {
			if(n > limita) {
				nrSaptamani++;
			}
		}
		return nrSaptamani;
	}
	
	/*
	 * 
	 * 
	 * determina procentul saptamanilor (din total saptamani) care au avut vanzari sub limita data
	 * 
	 */
	public int getProcentSaptamaniSlabe(int limita){
		float m = 0;
		for(Integer n: this.produseVanduteSaptamanal) {
			if(n < limita) {
				m ++;
			}
		}
		return (int) (100 * m / this.produseVanduteSaptamanal.size());
	}
	
	/*
	 * 
	 * 
	 * 
	 * determina indexul saptamanilor cu vanzari maxime (mai multe saptamani pot avea vanzari la nivel maxim)
	 * 
	 * 
	 */
	
	public ArrayList<Integer> getIndexSaptamaniCuVanzariMaxime(){
		ArrayList<Integer> saptamaniMax = new ArrayList<>();
		int max = this.produseVanduteSaptamanal.get(0);
		
		for(int i = 0; i < this.produseVanduteSaptamanal.size(); i++) {
			if(this.produseVanduteSaptamanal.get(i) > max) {
				saptamaniMax.add(i);
				max=this.produseVanduteSaptamanal.get(i);
			}
		}
		
		return saptamaniMax;
	}
	
	@Override
	public String toString() {
		String output = this.nume + " vanzari saptamanale: ";
		for(Integer n: produseVanduteSaptamanal)
			output += n + " ";
		return output;
	}	
}