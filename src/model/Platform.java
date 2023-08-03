package model;

public enum Platform {
	
	/**
	 * 
	 * ES MUY MUY MUY PROBABLE QUE FALTEN GENEROS SIN LISTAR
	 * 
	 * NO RECONOCE BIEN 3DS, 2600 Y TENGO QUE PONER "_EN ALGUNOS GRUPOS"
	 * 
	 */
	
	PS("PS"),
	DS("DS"),
	WII("WII"),
	X360("X360"),
	XB("XB"),
	PC("PC"),
	PSV("PSV"),
	_3DS("3DS"),
	_2600("2600"),
	N64("N64"),
	PS2("PS2"),
	PSP("PSP"),
	PS3("PS3"),
	SAT("SAT"),
	GB("GB"),
	GBA("GBA"),
	SNES("SNES"),
	NES("NES"),
	DC("DC"),
	PS4("PS4"),
	XONE("XONE"),
	WIIU("WIIU"),
	_TG16("TG16"),
	DONT_EXIST("DONT_EXIST");
	
	String string;
	
	
	private Platform(String string) {
		this.string = string;
	}


	public String getName() {
		return string;
	}


	public void setString(String string) {
		this.string = string;
	}
	
	

}
