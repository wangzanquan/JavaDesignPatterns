package com.javaSession.creational.three.builderTest;

import java.util.ArrayList;
import java.util.List;

public class CDType {
	private List<Packing> items = new ArrayList<>();
	
	public void addItem(Packing packs) {
		items.add(packs);
	}
	/*public void getCost() {
		for(Packing packs : items) {
			packs.price();
		}
	}*/
	public void showItems() {
		for(Packing packing : items) {
			System.out.println("CD name: " + packing.pack() + " , Price: " + packing.price());
		}
	}
	

}
