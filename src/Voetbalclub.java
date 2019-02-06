
public class Voetbalclub {
	private int aantalGewonnen, aantalGelijk, aantalVerloren;
	private String clubName;
//	constructor
	public Voetbalclub(String voetclub){
		clubName = voetclub;
	}
	
	public String toString(){
		  return clubName +"      "+aantalGespeeld() + "  "+ getWon() + "  "+ getGelijk() + "  " + getVerloren() +"  "+ aantalPunten() ;  
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
	
	public int aantalPunten(){
		return (aantalGewonnen * 3) + (aantalGelijk * 1);
	}
}
