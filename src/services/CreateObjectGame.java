package services;

import model.Game;
import model.Genre;
import model.Platform;
import model.Publisher;

public class CreateObjectGame {
	
	Game game = null;
 
    public Game createObjectGame(String name, Platform platform, int year, Genre gen, Publisher pub) {
    	try {
		
    	Game game = new Game(name, platform, year, gen, pub);
    	
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("\n\n\n\n no se han introducido valores correctos en createObject");
    		
    	}
    	return game;
		
	}
    
	
	
	
	
	
	

}
