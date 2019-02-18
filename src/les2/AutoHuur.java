package les2;

public class AutoHuur {
	private int aantalDagen;
	private Klant huurder;
	private Auto gehuurdeAuto;
	public AutoHuur() {
		
	}
	
	public void setAantalDagen(int aD) {
		aantalDagen = aD;
	}
	public void setGehuurdeAuto(Auto gA) {
		gehuurdeAuto = gA;
	}
	public void setHuurder(Klant k) {
		huurder = k;
	}
	public Auto getGehuurdeAuto() {
		return gehuurdeAuto;
	}
	public Klant getHuurder() {
		return huurder;
	}
	public double totaalPrijs() {
		double result;
		result = 0;
		result = gehuurdeAuto.getPrijsPerDag() * aantalDagen;
		if(huurder.getKorting() >= 1) {
					result = result - ((result / 100) * huurder.getKorting());
		}
		return result;
	}
	public String toString() {
		String result;
		result = "";
		
		if(getGehuurdeAuto() == null) {
			result +=  "er is geen auto bekend\n";
		}else {
			result +=  "autotype: " + getGehuurdeAuto() +"\n";	
		}
		if(getHuurder() == null) {
			result +=  "er is geen huurder bekend\n";
		}else {
			result +=  "op naam van: " + getHuurder()+"\n";	
		}
		if(getGehuurdeAuto() == null) {
			result +=  "aantal dagen: 0 en dat kost 0.0";
		}else {
			result +=  "autotype: "+ aantalDagen + " en dat kost " + totaalPrijs() +"\n";	
		}
		
		return result;
	
	}
	

}
