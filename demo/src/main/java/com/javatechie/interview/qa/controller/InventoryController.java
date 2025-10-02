package com.javatechie.interview.qa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.interview.qa.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;//Runtime polymorphism in your project
}
