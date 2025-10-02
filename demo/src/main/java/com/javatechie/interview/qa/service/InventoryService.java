package com.javatechie.interview.qa.service;

import java.util.List;

import com.javatechie.interview.qa.entity.Item;

public interface InventoryService {
	
	public A addItem(Item item);
	
	public Item addItem(List<Item> item);
	
	public Item searchItem(String itemName);
	
	public Item searchItem(String itemName, String color);

}
