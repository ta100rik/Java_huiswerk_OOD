
public class Voetbalclub {
	int aantalGewonnen, aantalGelijk, aantalVerloren;
	String clubName;
//	constructor
	public Voetbalclub(String voetclub){
		clubName = voetclub;
	}
	public String Voetbalclub() {
		return clubName;
	}
//	getters
	public int getWon() {
		return aantalGewonnen;
	}
	public int getGelijk() {
		return aantalGelijk;
	}
	public int getVerloren() {
		return aantalVerloren;
	}
// functions
	public void verwerkResultaat(char ch) {
	    if (ch == 'w')
	      aantalGewonnen = aantalGewonnen + 1;
	    if (ch == 'g')
	      aantalGelijk = aantalGelijk + 1;
	    if (ch == 'v')
	      aantalVerloren = aantalVerloren + 1;
	  }

	public int aantalGespeeld() {
		return aantalGewonnen + aantalGelijk + aantalVerloren;
	}
}
