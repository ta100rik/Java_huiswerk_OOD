package Practicum6a;
import java.util.ArrayList;

public class Persoon {
	
	private String naam;
	private double budget;
	private ArrayList<Game> mijnGames;
	
	public Persoon(String nm, double bud) {
		naam = nm;
		budget = bud;
		mijnGames = new ArrayList<Game>();
	}
	public boolean koop(Game g) {
		Game game = g;
		Double prijs = g.huidigeWaarde();
		boolean bol = true;
		for(int i = 0;i< mijnGames.size(); i++) {
			 if((mijnGames.get(i).getNaam()).equals(game.getNaam())) {
				 bol = false;
			 }
		}
		if(budget >= prijs && bol ) {
			budget = budget - prijs;
			mijnGames.add(game);
			return true;
		}else {
			return false;
		}
	}
	
	public boolean verkoop(Game g, Persoon koper) {
		Game game = g;
		Double prijs = g.huidigeWaarde();
//		boolean will turn on true if the current user has the game
		boolean bol = false;
		for(int i = 0;i< mijnGames.size(); i++) {
			 if((mijnGames.get(i).getNaam()).equals(game.getNaam())) {
				 bol = true;
			 }
		}
		
//		let's check now if the current user has the game
		if(bol) {
			/*				
 				if the user has the game
 				we can just run the buy method 
 				and after that give back the money
 				to the current user
			 */
			bol = koper.koop(game);
			if(bol) {
				budget = budget + prijs;
				mijnGames.remove(game);
			}
			return bol;
		}else {
			return bol;
		}
		
	}
	
	public Game zoekGameOpNaam(String g) {
		
		for(int i = 0;i< mijnGames.size(); i++) {
			 if((mijnGames.get(i).getNaam()).equals(g)) {
				return mijnGames.get(i);
			 }
		}
		return null;
	}
	public String toString() {
		
		String result = naam +" heeft een budget van " +  String.format( "%.2f", budget )+" en bezit de volgende games:\n";
		for(int i = 0;i< mijnGames.size(); i++) {
			result = result + mijnGames.get(i).toString() + "\n";
		}
		return result;
	}
}
