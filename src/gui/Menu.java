package gui;

import model.Genre;
import utilities.ReadKeyboard;

public class Menu {

	public static int showMenu() {
		System.out.println("Selecciona una opcion: \n");
		System.out.println("1) Agregar un nuevo juego");
		System.out.println("2) Mostrar lista de juegos");
		System.out.println("3) Filtrar por: ???");

		int button = 0;

		do {
			button = ReadKeyboard.readInt();

			if (button < 1 || button > 2) {
				System.out.println("Introduce un numero valido");
			}

		} while (button < 1 || button > 3);

		return button;

	}

	
	public static int chooseGenre() {
		
		System.out.println("Selecciona una genero: \n");
		
		int index = 1;
        for (Genre genre : Genre.values()) {
            System.out.println(index + ") " + genre.getName());
            index++;
        }
		
		int button = 0;
	
		do {
			button = ReadKeyboard.readInt();

			if (button < 1 || button > 2) {
				System.out.println("Introduce un numero valido");
			}

		} while (button < 1 || button > 3);

		return button;

	}
		
	
	}
}