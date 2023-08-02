package data;
import java.util.List;
import java.util.ArrayList;

public class ListGame {
	
	private ArrayList<T> listGames;

	public ListGame(ArrayList<T> listGames) {
		this.listGames = listGames;
		List<Game> listGame = new ArrayList<>();
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
