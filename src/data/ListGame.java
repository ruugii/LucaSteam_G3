package data;
import java.util.List;
import java.util.ArrayList;

public class ListGame <T>{
	
	private ArrayList<T> listGames;
	
	public ListGame() {
		listGames = new ArrayList<>();
	}

	/** FUNCTION TO ADD AN OBJECT GAME TO THE ARRAYLIST WHICH CONTAINS ALL AVAILABLE GAMES
	 * 
	 * @param <T> 
	 * @param Game Object containing game's information
	 */
	public static <T> void addGame(T Game) {
		listGame.add(Game);
	}
	
	public ArrayList<T> getListGames() {
		return listGames;
	}
	public void setListGames(ArrayList<T> listGames) {
		this.listGames = listGames;
	}

	@Override
	public String toString() {
		return "ListGame [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}
