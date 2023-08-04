package gui;

import model.Game;
import model.Platform;

import java.util.ArrayList;

public class FilterShowConsoleList{
    public static void showList(ArrayList<Game> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void showConsoles(ArrayList<Game> list, Platform PlatToFilter){
        for (int i = 0; i < list.size(); i++) {
            if (PlatToFilter.getName().equalsIgnoreCase(list.get(i).getPlatform().getName())){
                System.out.println(list.get(i));
            }
        }
    }
}
