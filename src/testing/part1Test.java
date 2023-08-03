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

   /* @Test
    void lengthData () {
        ArrayList<String> iData = DocumentRead.InicialData("src/resources/files/data.csv");
        assertEquals(iData.size(), 16598);
    }

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
    }*/
    
    @Test
    void addGame2() {
    	ListGame lg = new ListGame<>();
    	int length = lg.getListGames().size();
    	Game g = new Game("Sonic",Platform.GB,2012,Genre.ADVENTURE,new Publisher("One"));
    	lg.addGame(g);
    	assertEquals(lg.getListGames().size(),length + 1);
    }
    
    
    
}
