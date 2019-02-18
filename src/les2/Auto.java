package les2;

public class Auto {
	private String type;
	private int prijsPerDag = 1;
	public Auto(String tp,int prPd){
		type = tp;
		prijsPerDag = prPd;
	}
	public void setPrijsPerDag(int prPd) {
		prijsPerDag = prPd;
	}
	public double getPrijsPerDag() {
		return prijsPerDag;
	}
	public String toString() {
		return type + " met prijs per dag:" + prijsPerDag;
		
	}
}
