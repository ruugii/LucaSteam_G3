package services;
import data.ListGame;
import model.Platform;
import model.Game;
import model.Genre;

import java.util.ArrayList;

public class GameService {

    static ListGame lg = new ListGame();
    public static void InicialData(ArrayList<String> option) {
        for (String line : option) {
            String[] hasComilllas = line.split("\"");
            String[] separateComa = line.split(",");
            try {
                if (line.contains(",") && line.split(",").length >= 5) {
                    if (!separateComa[1].contains("\"")) {
                        String[] aux = line.split(",");
                        if (aux[3].equalsIgnoreCase("N/A")) {
                            lg.addGame(CreateObjectGame.createGame(aux[1], aux[2], 0, aux[4], aux[5]));
                        } else {
                            lg.addGame(CreateObjectGame.createGame(aux[1], aux[2], Integer.parseInt(aux[3]), aux[4], aux[5]));
                        }
                    } else {
                        String[] aux = hasComilllas[2].split(",");
                        if (aux[2].equalsIgnoreCase("N/A")) {
                            lg.addGame(CreateObjectGame.createGame(
                                    "\"" + hasComilllas[1] + "\"",
                                    aux[1], 0, aux[3], aux[4]
                            ));
                        } else {
                            lg.addGame(CreateObjectGame.createGame(
                                    "\"" + hasComilllas[1] + "\"",
                                    aux[1], Integer.parseInt(aux[2]), aux[3], aux[4]
                            ));
                        }
                    }
                }
            } catch (Error e){
                lg.addGame(line);
            }
        }
    }

    public static ArrayList<Game> showGameList(){
        return lg.getGames();
    }

    public static ArrayList<String> getDocumentFormat() {
        ArrayList<Game> games = lg.getGames();
        ArrayList<String> write = new ArrayList<>();
        for (int i = 0; i < games.size(); i++) {
            write.add(games.get(i).getDocumentFormat());
        }
        return write;
    }
    public static void add(Game g){
        lg.addGame(g);
    }

    public static ArrayList<Game> sortGen(Genre gen){
        ArrayList<Game> games = lg.getGames();
        ArrayList<Game> gamesFilter = new ArrayList<>();

        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getGen().getName().equalsIgnoreCase(gen.getName())){
                gamesFilter.add(games.get(i));
            }
        }
        return gamesFilter;
    }
    
    public static ArrayList<Game> sortConsole(Platform plat){
        ArrayList<Game> games = lg.getGames();
        ArrayList<Game> gamesFilter = new ArrayList<>();

        for (int i = 0; i < games.size(); i++) {
            if (games.get(i).getPlatform().getName().equalsIgnoreCase(plat.getName())){
                gamesFilter.add(games.get(i));
            }
        }
        return gamesFilter;
    }
}
