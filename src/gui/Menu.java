package gui;

import data.GameDAO;
import data.ListGame;
import model.Genre;
import model.Platform;
import services.CreateObjectGame;
import services.GameService;
import utilities.DocumentRead;
import utilities.ReadData;

public class Menu {

	/**
	 * 
	 * SOLO MUESTRA MENU
	 */
	public static void showMenu() {
		String[] option = {"Agregar un nuevo juego", "Mostrar lista de juegos", "Muestrame los juegos filtrados por...", "Salir"};
		String menu = "Elige la opcion que desees: \n\t";

		for (int i = 0; i < option.length; i++) {
			menu += (i + 1) + ".- " + option[i] + "\n\t";
		}

		int button;
		do {
			button = ReadData.readInt(menu, 1, option.length);
			switch (button) {
				case 1:
					GameService.add(GameDAO.createNewGame());
					break;
				case 2:
					FilterShowGameList.showList(GameService.showGameList());
					break;
				case 3:
					String[] option_2 = {"Por genero", "Plataforma", "Publisher"};
					String menu_2 = "Elige la opcion que desees: \n\t";
					for (int i = 0; i < option_2.length; i++) {
						menu_2 += (i + 1) + ".- " + option_2[i] + "\n\t";
					}
					int btn_2 = ReadData.readInt(menu_2, 1, option_2.length);
					switch (btn_2){
						case 1:
							FilterShowGameList.showList(GameDAO.sortGen(chooseGenre()));
							break;
						case 2:
							FilterShowGameList.showList(GameDAO.sortConsole(choosePlatform()));
						default:
							System.out.println("We are working on it");
					}
			}
		} while (button != option.length);
		DocumentRead.SaveData("src/resources/files/data.csv", GameService.getDocumentFormat());
	}

	/**
	 * 
	 * MENU CREANDO JUEGO ELIGE  GENERO
	 */
	public static Genre chooseGenre() {
		return CreateObjectGame.elegirGenero();
	}
	
	/**
	 * 
	 * MENU CREANDO JUEGO ELIGE  PLATAFORMA
	 */
	public static Platform choosePlatform() {
		return  CreateObjectGame.elegirPlatform();
	}

	 /**
	 * 
	 * ELIGE COMO FILTRAR
	 * */
	
	public static int showMeShortBy() {
		
		System.out.println("1) Genero");
		System.out.println("2) Plataformas");
		

		int button = 0;

		do {
			button = ReadData.readInt("Selecciona una opcion:");

			if (button < 1 || button > 2) {
				System.out.println("Introduce un numero valido");
			}

		} while (button < 1 || button > 2);

		return button;
		
		
	}

}
