package services;
import data.ListGame;
import model.Game;
import model.Genre;
import model.Platform;
import model.Publisher;

import java.util.ArrayList;

public class GameService {
    public static void InicialData(ArrayList<String> option) {
        for (String line: option){
            String[] aux = line.split(",");
            System.out.println(line);
            createGame(aux[1], aux[2], Integer.parseInt(aux[3]), aux[4], aux[5]);
        }
    }

    public static void createGame(String a, String platformName, int c, String GenreName, String e){
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
        Platform b = Platform.DONT_EXIST;
        Genre d = Genre.DONT_EXIST;
        for (int i = 0; i < ArP.length; i++) {
            if (platformName.equalsIgnoreCase(ArP.getName())){
                b = ArP[i];
            }
        }

        for (int i = 0; i < GeP.length; i++) {
            if (platformName.equalsIgnoreCase(GeP.getName())){
                d = GeP[i];
            }
        }


        new Game(a, b, c, d, new Publisher(e));
    }
}
