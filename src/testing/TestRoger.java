package testing;

import data.GameDAO;
import data.ListGame;
import model.Genre;
import model.Platform;
import model.Game;
import model.Publisher;

import org.junit.jupiter.api.Test;
import services.CreateObjectGame;
import services.GameService;
import utilities.DocumentRead;
import utilities.MathOperation;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRoger {
    private final ListGame lg = new ListGame();

    @Test
    void WriteData() {
        ArrayList<String> iData = DocumentRead.InicialData("src/resources/files/data.csv");
        int length = iData.size();
        iData.add("this is a test of the testing");
        DocumentRead.SaveData("src/resources/files/data.csv", iData);
        iData = DocumentRead.InicialData("src/resources/files/data.csv");
        assertEquals(length + 1, iData.size());
    }

    @Test
    void WriteData2() {
        ArrayList<String> iData = DocumentRead.InicialData("src/resources/files/data.csv");
        int length = iData.size();
        final String testText = "THIS IS A TEST OF THE STRING WHEN YOU WRITE";
        iData.add(testText);
        DocumentRead.SaveData("src/resources/files/data.csv", iData);
        iData = DocumentRead.InicialData("src/resources/files/data.csv");
        assertEquals(testText, iData.get(iData.size() - 1));
    }
    
    @Test
    void addGame2() {
    	ListGame lg = new ListGame<>();
    	int length = lg.getListGames().size();
    	Game g = new Game("Sonic",Platform.GB,2012,Genre.ADVENTURE,new Publisher("One"));
    	lg.addGame(g);
    	assertEquals(lg.getListGames().size(),length + 1);
    }

    @Test
    void correctFilter(){
        GameService.InicialData(DocumentRead.InicialData("src/resources/files/data.csv"));
        Genre [] GeP = { Genre.PLATFORM, Genre.SPORTS, Genre.RACING, Genre.SHOOTER, Genre.MISC, Genre.ACTION, Genre.ROLEPLAYING, Genre.PUZZLE, Genre.FIGHTING, Genre.STRATEGY, Genre.ADVENTURE, Genre.SIMULATION, Genre.DONT_EXIST};
        Genre gen = GeP[MathOperation.getRandomNumber(0, GeP.length)];
        assertEquals(
                GameService.sortGen(gen).get(
                        MathOperation.getRandomNumber(
                                0, GameService.sortGen(gen).size()
                        )
                ).getGen(), gen
        );
    }

    @Test
    void isAnArray(){
        GameService.InicialData(DocumentRead.InicialData("src/resources/files/data.csv"));
        Genre [] GeP = { Genre.PLATFORM, Genre.SPORTS, Genre.RACING, Genre.SHOOTER, Genre.MISC, Genre.ACTION, Genre.ROLEPLAYING, Genre.PUZZLE, Genre.FIGHTING, Genre.STRATEGY, Genre.ADVENTURE, Genre.SIMULATION, Genre.DONT_EXIST};
        Genre gen = GeP[MathOperation.getRandomNumber(0, GeP.length)];
        assertEquals(GameService.sortGen(gen).getClass(), new ArrayList<>().getClass());
    }

    @Test
    void isOk() {
        Game game1 = CreateObjectGame.createGame("Draco", "xb" , 2002, "action", "bethesda");
        Game game2 = new Game("Draco", Platform.XB , 2002, Genre.ACTION, new Publisher("bethesda"));
        assertEquals(game1.getValue(), game2.getValue());
    }

    @Test
    void isOkCreate() {
        Game game1 = CreateObjectGame.createGame("Draco", Platform.XB , 2002, Genre.ACTION, new Publisher("bethesda"));
        Game game2 = new Game("Draco", Platform.XB , 2002, Genre.ACTION, new Publisher("bethesda"));
        assertEquals(game1.getValue(), game2.getValue());
    }
    
}
