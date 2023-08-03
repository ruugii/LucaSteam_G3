package services;

import model.Game;
import model.Genre;
import model.Platform;
import model.Publisher;
import utilities.ReadData;

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

	public static Game createGame(String a, String platformName, int c, String GenreName, String e){
		Genre [] GeP = { Genre.PLATFORM, Genre.SPORTS, Genre.RACING, Genre.SHOOTER, Genre.MISC, Genre.ACTION, Genre.ROLEPLAYING, Genre.PUZZLE, Genre.FIGHTING, Genre.STRATEGY, Genre.ADVENTURE, Genre.SIMULATION};
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

		Platform b = Platform.DONT_EXIST;
		Genre d = Genre.DONT_EXIST;
		for (int i = 0; i < ArP.length; i++) {
			Platform aux = ArP[i];
			if (platformName.equalsIgnoreCase(aux.getName())){
				b = ArP[i];
			}
		}

		for (int i = 0; i < GeP.length; i++) {
			Genre aux = GeP[i];
			if (GenreName.equalsIgnoreCase(aux.getName())){
				d = GeP[i];
			}
		}

		return new Game(a, b, c, d, new Publisher(e));
	}

	public static Genre elegirGenero() {
		Genre [] GeP = { Genre.PLATFORM, Genre.SPORTS, Genre.RACING, Genre.SHOOTER, Genre.MISC, Genre.ACTION, Genre.ROLEPLAYING, Genre.PUZZLE, Genre.FIGHTING, Genre.STRATEGY, Genre.ADVENTURE, Genre.SIMULATION};
		String menu = "Escribe el genero que prefieras: ";
		for (int i = 0; i < GeP.length; i++) {
			menu += (i + 1) + ".- " + GeP[i].getName() + "\n\t";
		}

		int btn = ReadData.readInt(menu, 1, GeP.length);
		return GeP[btn - 1];
	}

}
