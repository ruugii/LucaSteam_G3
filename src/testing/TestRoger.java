package testing;

import data.ListGame;
import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.DocumentRead;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRoger {
    private final ListGame lg = new ListGame();
    ArrayList<String> defaultData = DocumentRead.InicialData("src/resources/files/data.csv");

    @AfterEach
    void write () {
        ArrayList<String> defaultData = DocumentRead.InicialData("src/resources/files/data.csv");
        while (!defaultData.get(defaultData.size()-1).contains(",")){
            defaultData.remove(defaultData.size()-1);
        }
        DocumentRead.SaveDataTest("src/resources/files/data.csv", defaultData);
    }


    @Test
    void lengthData () {
        ArrayList<String> iData = DocumentRead.InicialData("src/resources/files/data.csv");
        assertEquals(iData.size(), defaultData.size());
    }

    @Test
    void WriteData() {
        ArrayList<String> iDataInicial = DocumentRead.InicialData("src/resources/files/data.csv");
        ArrayList<String> iData = iDataInicial;
        int length = iData.size();
        iData.add(iData.size() + "this is a test of the testing");
        DocumentRead.SaveData("src/resources/files/data.csv", iData);
        iData = DocumentRead.InicialData("src/resources/files/data.csv");
        assertEquals(length + 1, iData.size());
    }

    @Test
    void WriteData2() {
        ArrayList<String> iData = DocumentRead.InicialData("src/resources/files/data.csv");
        int length = iData.size();
        final String testText = iData.size() + "THIS IS A TEST OF THE STRING WHEN YOU WRITE";
        iData.add(testText);
        DocumentRead.SaveData("src/resources/files/data.csv", iData);
        iData = DocumentRead.InicialData("src/resources/files/data.csv");
        assertEquals(testText, iData.get(iData.size() - 1));
    }

    @Test
    void isAnArrayList(){
        assertEquals(lg.getGames().getClass(), new ArrayList<>().getClass());
    }
}
