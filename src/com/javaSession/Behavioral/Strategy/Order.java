package com.javaSession.Behavioral.Strategy;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class Order {

	private String id;
	
	private LocalDate date;
	
	private Map<String, Double> items = new HashMap<>();
	
	private double total;

	public Order(String id) {
		super();
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public LocalDate getDate() {
		return date;
	}

	public Map<String, Double> getItems() {
		return items;
	}

	public double getTotal() {
		return total;
	}
	
	public void setTotal(double total) {
		this.total = total;
	}
	
	public void addItem(String name, double price) {
		items.put(name, price);
		total += price;
	}
	
	
	
	
	
	
}
