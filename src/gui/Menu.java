package gui;

import model.Genre;
import model.Platform;
import utilities.ReadData;

public class Menu {

	/**
	 * 
	 * SOLO MUESTRA MENU
	 */
	public static int showMenu() {
		
		System.out.println("1) Agregar un nuevo juego");
		System.out.println("2) Mostrar lista de juegos");
		System.out.println("3) Muestrame los juegos filtrados por...");

		int button = 0;

		do {
			button = ReadData.readInt("Selecciona una opcion:");

			if (button < 1 || button > 3) {
				System.out.println("Introduce un numero valido");
			}

		} while (button < 1 || button > 3);
		
		if(button==3) {
			Menu.showMeShortBy();
		}

		return button;

	}

	/**
	 * 
	 * MENU CREANDO JUEGO ELIGE  GENERO
	 */
	public static int chooseGenre() {


		int index = 1;
		for (Genre genre : Genre.values()) {
			System.out.println(index + ") " + genre.getName());
			index++;
		}

		int button = 0;

		do {
			button = ReadData.readInt("Selecciona un genero: \n");

			if (button < 1 || button > 2) {
				System.out.println("Introduce un numero valido");
			}

		} while (button < 1 || button > 3);

		return button;

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
