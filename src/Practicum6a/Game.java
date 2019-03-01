package Practicum6a;

import java.time.LocalDate;

public class Game {
	private String naam;
	private int releaseJaar;
	private double nieuweprijs;
	
	public Game(String NM, int rJ, double nwpr ) {
		naam = NM;
		releaseJaar = rJ;
		nieuweprijs = nwpr;
		
	}
	
	public String getNaam() {
		return naam;
	}
	public double huidigeWaarde() {
		
		int currentyear 		= LocalDate.now().getYear();
		int diffyears 			=  currentyear - releaseJaar; 
		Double huidigewaarde 	= nieuweprijs;
		for (int x = 1; x <= diffyears ; x++) {
			huidigewaarde 	= ((huidigewaarde / 100) * 70);
		} 
		return huidigewaarde;
		
		
	}
//	don't know the purpose of the equals function so i left it out
	
	public String toString() {
		String result = naam + ", uitgegeven in "+releaseJaar+"; nieuwprijs: "+String.format( "%.2f",nieuweprijs)+" nu voor:" + String.format( "%.2f",huidigeWaarde()) ;
		return result;
	}
}
