package Practicum_3A;

public class Persoon {
	private String naam;
	private Integer leeftijd;
	public Persoon(String nm, Integer lft) {
		naam = nm;
		leeftijd = lft;
	}
	public String toString() {
		String result = naam +"; leeftijd "+leeftijd +"jaar";
		return result;
	}
}
