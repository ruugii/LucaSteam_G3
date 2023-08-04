package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import data.ListGame;
import model.Game;
import model.Genre;
import model.Platform;
import model.Publisher;
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
    
	public Game createNewGame() {
		
		final String pl, ge;
		
			Platform[] ArP = {
                Platform.PS,
                Platform.DS,
                Platform.WII,
                Platform.X360,
                Platform.XB,
                Platform.PC,
                Platform.PSV,
                Platform._3DS,
                Platform._2600,
                Platform.N64,
                Platform.PS2,
                Platform.PSP,
                Platform.PS3,
                Platform.SAT,
                Platform.GB,
                Platform.GBA,
                Platform.SNES,
                Platform.NES,
                Platform.DC,
                Platform.PS4,
                Platform.XONE,
                Platform.WIIU,
                Platform._TG16
        };

		String menu = "Selecciona la consola: \n";
		for (int i = 0; i < ArP.length; i++) {
		    menu += (i + 1) + ".- " + ArP[i].getName()+"\n\t";
		}
		int x = ReadData.readInt();
		pl = ArP[x-1].getName();
		
        Genre [] GeP = {
                Genre.PLATFORM,
                Genre.SPORTS,
                Genre.RACING,
                Genre.SHOOTER,
                Genre.MISC,
                Genre.ACTION,
                Genre.ROLEPLAYING,
                Genre.PUZZLE,
                Genre.FIGHTING,
                Genre.STRATEGY,
                Genre.ADVENTURE,
                Genre.SIMULATION
        };
        
		String menu2 = "Selecciona la consola: \n";
		for (int j = 0; j < GeP.length; j++) {
		    menu2 += (j + 1) + ".- " + ArP[j].getName()+"\n\t";
		}
		
		int y = ReadData.readInt();
		ge = GeP[y-1].getName();
		
		return GameService.createGame(ReadData.readString("Introduce el nombre:"), pl, ReadData.readInt("Introduce el año:"), ge, ReadData.readString("Introduce el publisher:") );


	}
}
