package ro.ase.csie.cts.g1088.laborator.interfete;

public interface Profitabil {

	//o interfata =clasa abstracta ce contine doar metode abstracte si atribute statice/constante
	//clasele abstracte =clase ce contin cel putin o metoda abstracta
	
	public static final int MAX_PROCENT_DOBANDA = 5;
	
	public abstract void adaugaDobanda(double procentDobanda);
	
}
