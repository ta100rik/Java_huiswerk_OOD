
public class Zwembad {
	private double Lengte;
	private double Breedte;
	private double Diepte;
	public Zwembad(double len,double bred,double diep){
		Lengte = len;
		Breedte = bred;
		Diepte = diep;
	}
	public String toString() {
		String result = "GEGEVENS ZWEMBAD: Dit zwembad is "+Breedte+" meter breed, "+Lengte+" meter lang, en "+Diepte+" meter diep";
		return result;
	}
	public String berekenenInhoud() {
		double result = Lengte * Breedte * Diepte;
		String template = "BEREKENEDE INHOUD: ";
		return template +  result;
	}
}
