package gui;

import java.util.ArrayList;

import model.Publisher;

public class FilterShowPublisherList {
	
	public static void showPublishers(ArrayList<Publisher> publisher) {
		
		for (int i = 0; i < publisher.size(); i++) {
			System.out.println(publisher.get(i));
		}
	}

}
