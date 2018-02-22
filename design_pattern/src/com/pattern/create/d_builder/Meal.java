package com.pattern.create.d_builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<Item>();
	
	public void addItem(Item item){
		items.add(item);
	}
	
	public float getCost(){
		float cost = 0.0F;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}
	
	public void showItems(){
		System.out.println("....");
		for (Item item : items) {
			System.out.println("\t Item : " + item.name());
			System.out.println("\t Packing : " + item.packing());
			System.out.println("\t Price : " + item.price());
			System.out.println("\t ---------------------");
		}
	}
}
