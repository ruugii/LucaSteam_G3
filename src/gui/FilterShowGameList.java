package gui;

import model.Game;

import java.util.ArrayList;

public class FilterShowGameList{
    public static void showList(ArrayList<Game> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
