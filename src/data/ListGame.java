package data;
import model.Game;

import java.util.List;
import java.util.ArrayList;
import model.Game;

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
	
	/** FUNCTION TO CHECK WHETHER A GAME IS ALREADY INCLUDED IN THE LIST
	 * 
	 * @param g Game to check against the existing list
	 * @return
	 */
	public boolean alreadyExist(Game g) {
		for (int i = 0;i< this.listGames.size();i++) {
			if(g.getName() == this.listGames.get(i)) return true;
			else return false;
		}
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
