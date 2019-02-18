package practicum4;

import java.util.ArrayList;

public class Klas {
	private String klasCode;
	private ArrayList<Leerling> deLeerlingen;
	
	public Klas(String Kc) {
		klasCode = Kc;
		deLeerlingen = new ArrayList<Leerling>();
	}
	public void voegLeerlingToe(Leerling I) {
		deLeerlingen.add(I);
	}
	public  ArrayList<Leerling> getLeerlingen()  {
		return deLeerlingen;
	}
	public void wijzigCijfer(String nm,double nweCijfer) {

		for (Leerling leerling : deLeerlingen) {
			if(leerling.getNaam().equals(nm)) {
				leerling.setCijfer(nweCijfer);
			}
		}
	}
	public int aantalLeerlingen() {
		return deLeerlingen.size();
	}
	public String toString(){
		String result;
		result = "In klas "+klasCode+" zitten de volgende leerlingen: \n";
		for (Leerling leerling : deLeerlingen) {
			result += leerling;	
		}
		return result;
	}
	
	

}
