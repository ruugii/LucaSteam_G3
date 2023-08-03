package gui;

import model.Game;
import model.Genre;

import java.util.ArrayList;
import java.util.Collection;

public class FilterShowGameList{
    public static void showList(ArrayList<Game> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void showGames(ArrayList<Game> list, Genre GenToFilter){
        for (int i = 0; i < list.size(); i++) {
            if (GenToFilter.getName().equalsIgnoreCase(list.get(i).getGen().getName())){
                System.out.println(list.get(i));
            }
        }
    }
}
