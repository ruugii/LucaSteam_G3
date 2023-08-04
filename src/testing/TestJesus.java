package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import data.GameDAO;
import org.junit.jupiter.api.Test;

import data.ListGame;
import model.Game;
import model.Genre;
import model.Platform;
import model.Publisher;
import services.CreateObjectGame;
import services.GameService;
import utilities.ReadData;

public class TestJesus {
    @Test
    void addGame2() {
    	ListGame lg = new ListGame<>();
    	int length = lg.getListGames().size();
    	Game g = new Game("Sonic",Platform.GB,2012,Genre.ADVENTURE,new Publisher("One"));
    	lg.addGame(g);
    	assertEquals(lg.getListGames().size(),length + 1);
    }
}
