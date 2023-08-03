package data;
import model.Game;

import java.util.List;
import java.util.ArrayList;

public class ListGame <T>{
	
	private ArrayList<T> listGames;

	/** FUNCTION TO ADD AN OBJECT GAME TO THE ARRAYLIST WHICH CONTAINS ALL AVAILABLE GAMES
	 * 
	 * @param <T> 
	 * @param Game Object containing game's information
	 */

	public ListGame() {
		listGames = new ArrayList<>();
	}

	/** FUNCTION TO ADD AN OBJECT GAME TO THE ARRAYLIST WHICH CONTAINS ALL AVAILABLE GAMES
	 * 
	 * @param <T> 
	 * @param Game Object containing game's information
	 */
	public void addGame(T Game) {
		this.listGames.add(Game);
	}
	
	public ArrayList<T> getListGames() {
		return listGames;
	}
	public void setListGames(ArrayList<T> listGames) {
		this.listGames = listGames;
	}

	public ArrayList<Game> getGames(){
		ArrayList<Game> aux = new ArrayList<>();
		for (int i = 0; i < listGames.size(); i++) {
			if (listGames.get(i).getClass() == new Game().getClass()){
				aux.add((Game) listGames.get(i));
			} else {
				System.out.println(listGames.get(i));
			}
		}
		return aux;
	}

	@Override
	public String toString() {
		return "ListGame [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
