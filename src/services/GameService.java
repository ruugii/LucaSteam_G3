package services;
import data.ListGame;

public class GameService {
	
	/** FUNCTION TO ADD AN OBJECT GAME TO THE ARRAYLIST WHICH CONTAINS ALL AVAILABLE GAMES
	 * 
	 * @param <T> 
	 * @param Game Object containing game's information
	 */
	public static <T> void addGame(T Game) {
		listGame.add(Game);
	}
}
