package controller;

import gui.FilterShowGameList;
import services.GameService;
import utilities.DocumentRead;

public class LucaSteam_G3 {
    public static void init(){
        GameService.InicialData(DocumentRead.InicialData("src/resources/files/data.csv"));
        ShowGames();
    }

    private static void ShowGames(){
        FilterShowGameList.showList(GameService.showGameList());
    }
}
