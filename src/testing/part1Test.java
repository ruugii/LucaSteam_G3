package testing;

import data.ListGame;
import model.Genre;
import model.Platform;
import model.Game;
import model.Publisher;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import services.GameService;
import utilities.DocumentRead;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class part1Test {
    private final ListGame lg = new ListGame();



    
    @Test
    void addGame2() {
    	ListGame lg = new ListGame<>();
    	int length = lg.getListGames().size();
    	Game g = new Game("Sonic",Platform.GB,2012,Genre.ADVENTURE,new Publisher("One"));
    	lg.addGame(g);
    	assertEquals(lg.getListGames().size(),length + 1);
    }
    
    

    
}
