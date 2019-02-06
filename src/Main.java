
// assignment 2A
//public class Main {
//  public static void main(String[] arg) {
//    Zwembad z1 = new Zwembad(2.0, 5.5, 1.5);
//    System.out.println("BREEDTE: " + z1.getBreedte());
//    System.out.println("LENGTE: " + z1.getLengte());
//    System.out.println("DIEPTE: " + z1.getDiepte());
//    System.out.println("BEREKENDE INHOUD: " + z1.berekenenInhoud());
//    System.out.println();
//
//    Zwembad z2 = new Zwembad( );
//    z2.setBreedte(2.5);
//    z2.setLengte(100.0);
//    z2.setDiepte(2.0);
//    double inh = z2.berekenenInhoud();
//    System.out.println("GEGEVENS ZWEMBAD: "+z2.toString());
//    System.out.println("BEREKENDE INHOUD: " + z2.berekenenInhoud());
//  }
//}
public class Main {
	public static void main(String[] arg) {
		Voetbalclub ajx = new Voetbalclub("Ajax      ");
	    System.out.println(ajx);
	    Voetbalclub feij = new Voetbalclub("Feijenoord");
	    feij.verwerkResultaat('w');
	    feij.verwerkResultaat('w');
	    feij.verwerkResultaat('w');
	    feij.verwerkResultaat('g');
	    System.out.println(feij);
	}
}

//first try of java messy code
//public class Main {
//
//	public static void main(String[] arg){
//			//Klant k1 = new Klant("Henk","jan van boylaan","Hilversum");
//			//Klant k2 = new Klant("Arjan","veemkade 524","utrecht");
//			//System.out.println(k1.getFullname());
//			Self_study_1 les1 = new Self_study_1();
//			//les1.forLoop();
//			//les1.whileloop();
//			//System.out.println(les1.random());
////			les1.sawLoop();
//			//System.out.println(les1.totalLoop());
//			// This one below was a assignment in the lesson not self study
//			//les1.optellen(174, 26);
//			
//			Zwembad first_zwembad = new Zwembad(100,2.5,2.0);
//			System.out.println(first_zwembad.berekenenInhoud());
//			System.out.println(first_zwembad.toString());
//			
//			
//	}
//}