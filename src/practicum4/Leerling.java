package practicum4;

public class Leerling {
	private String naam;
	private double cijfer;
	public Leerling(String nm) {
		naam = nm;
	}
	public String getNaam() {
		return naam;
	}
	public double getCijfer() {
		return cijfer;
	}
	public void setCijfer(double c) {
		cijfer = c;
	}
	public String toString() {
		String result;
		result = naam + " Heeft cijfer: " + getCijfer() + "\n";
		return result;
	}
}
