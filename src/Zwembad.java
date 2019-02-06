
public class Zwembad {
	private double Lengte;
	private double Breedte;
	private double Diepte;
//	constructor defined here
	public Zwembad(double bred,double len,double diep){
		Lengte = len;
		Breedte = bred;
		Diepte = diep;
	}
	public Zwembad(){
		
	}
//	setters define below
	public void setBreedte(double value) {
		Breedte = value;
	}
	public void setLengte(double value) {
		Lengte = value;
	}
	public void setDiepte(double value) {
		Diepte = value;
	}
// 	getters defined below
	public double getBreedte() {
		return Breedte;
	}
	public double getDiepte() {
		return Diepte;
	}
	public double getLengte() {
		return Lengte;
	}
	
//	Methodes that combines data
	public String toString() {
		String result = "Dit zwembad is "+Breedte+" meter breed, "+Lengte+" meter lang, en "+Diepte+" meter diep";
		return result;
	}
	public double berekenenInhoud() {
		double result = Lengte * Breedte * Diepte;
		return result;
	}
}
