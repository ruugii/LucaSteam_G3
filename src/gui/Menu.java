package gui;

import data.ListGame;
import model.Genre;
import model.Platform;
import services.CreateObjectGame;
import services.GameService;
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
					System.out.println("WE ARE WORKING ON IT");
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
							FilterShowGameList.showGames(GameService.showGameList(), chooseGenre());
							break;
						default:
							System.out.println("We are working on it");
					}
			}
		} while (button != option.length);
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
	public static int choosePlatform() {
		int index = 1;
		for (Platform platform: Platform.values()) {
			System.out.println(index + ") " + platform.getName());
			index++;
		}

		int button = 0;

		do {
			button = ReadData.readInt("Selecciona una plataforma: \n");

			if (button < 1 || button > 2) {
				System.out.println("Introduce un numero valido");
			}

		} while (button < 1 || button > 3);

		return button;

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
