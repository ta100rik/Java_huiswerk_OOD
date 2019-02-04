
public class Klant {
	private String naam;
	private String adres;
	private String plaats;
	public Klant(String nm, String adr, String pl) {
		naam = nm;
		adres = adr;
		plaats = pl;
		
	}
	public String getName() {
			return naam;
	}
	public String getFullname() {
		return naam + " " + adres + " " + plaats;
	}
}
