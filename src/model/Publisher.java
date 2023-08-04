package model;

import data.ListGame;
import services.GameService;

public class Publisher {
	String name;

	public Publisher(String name) {
		this.name = name;
		addNewPublisher();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void addNewPublisher(){
		GameService.add(this);
	}

	@Override
	public String toString() {
		return name;
	}	
}
