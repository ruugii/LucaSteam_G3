package gui;

import java.util.ArrayList;

import model.Publisher;

public class FilterShowPublisherList {
	
	public static void showPublishers(ArrayList<String> publisher) {

		for (int i = 0; i < publisher.size(); i++) {
			System.out.print(publisher.get(i) + " | ");
			if (i % 10 == 0){
				System.out.println();
			}
		}
	}

}
