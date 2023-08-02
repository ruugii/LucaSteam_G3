package services;

import model.Game;
import model.Genre;
import model.Platform;
import model.Publisher;

public class CreateObjectGame {
	
 
    public Game createObjectGame(int id, String name, Platform platform, int year, Genre gen, Publisher pub) {
		
    	Game game = new Game(id, name, platform, year, gen, pub);
    	
		return game;
	}
    
	
	
	
	
	
	

}
