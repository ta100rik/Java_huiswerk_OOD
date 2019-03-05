package Practicum_3A;

public class Huis {

	private String adres;
	private Integer bouwjaar;
	private Persoon huisbaas;
	public Huis(String adr,Integer bwjr ) {
		adres = adr;
		bouwjaar = bwjr;
	}
	
	public void setHuisbaas(Persoon hb) {
		huisbaas = hb;
	}
	public Persoon getHuisbaas() {
		return huisbaas;
	}
	public String toString() {
		String result = "Huis " + adres + "is gebouwd in "+ bouwjaar + "\n"; 
		result += "en heeft huisbaas " + huisbaas.toString();
		return result;
	}
	
}
