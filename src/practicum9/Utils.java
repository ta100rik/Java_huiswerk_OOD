package practicum9;

public class Utils {
	private static int aantalAanroepen = 0;
	
	public static void main(String[] args ) {
		System.out.println(euroBedrag(34.5678));
		System.out.println(euroBedrag(34.5678,2));

		System.out.println(euroBedrag(34.5678,3));

		System.out.println(getAantalAanroepen());
	}
	
	public static String euroBedrag(Double bedrag) {
		aantalAanroepen++;
		return String.format("%.2f", bedrag);
	}
	public static String euroBedrag(Double bedrag, Integer precisie) {
		aantalAanroepen++;
		return String.format("%." + precisie + "f", bedrag);
	}
	public static int getAantalAanroepen() {
		return aantalAanroepen;
	}
}
