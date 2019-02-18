package les2;

public class Klant {
	private String naam;
	private double kortingsPercentage;
//	constructor
	public Klant(String nm) {
		naam = nm;
	}
	public void setKorting(double kp) {
		kortingsPercentage = kp;
	}
	public double getKorting() {
		return kortingsPercentage;
	}
	public String toString() {
		return naam +" (korting: "+kortingsPercentage 	+"%)";
		
	}
}
