package controller;

import gui.FilterShowGameList;
import gui.Menu;
import model.Genre;
import services.GameService;
import utilities.DocumentRead;

public class LucaSteam_G3 {
    public static void init(){
        GameService.InicialData(DocumentRead.InicialData("src/resources/files/data.csv"));
        Menu.showMenu();
    }

    private static void ShowGames(){
        FilterShowGameList.showList(GameService.showGameList());
    }

    private static void ShowGamesByGen(){
        FilterShowGameList.showGames(GameService.showGameList(), Genre.ACTION);
    }
}
