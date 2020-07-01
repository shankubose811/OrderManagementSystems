package com.OrderManagementSystem.app.OrderManagementSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Accessory;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Color;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Model;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Series;
import com.OrderManagementSystem.app.OrderManagementSystem.Repo.AccessoryRepo;
import com.OrderManagementSystem.app.OrderManagementSystem.service.AccessoryService;
import com.OrderManagementSystem.app.OrderManagementSystem.service.ColorService;
import com.OrderManagementSystem.app.OrderManagementSystem.service.ModelService;
import com.OrderManagementSystem.app.OrderManagementSystem.service.SeriesService;

@RestController
public class OrderManagementController {
	
	@Autowired
	SeriesService seriesService;
	
	@Autowired
	ModelService modelService;
	
	@Autowired
	ColorService colorService;
	
	@Autowired
	AccessoryService accyService;
	
	
	
	@GetMapping("/series")
	public List<Series> fetchSeriesList(){
		
		return seriesService.getSeriesList();
		
	}
	
//	@GetMapping("/model")
//	public List<Model> fetchModelList(){
//		
//		return modelService.getModel();
//		
//	} 
	
//	@GetMapping("/color")
//	public List<Color> fetchColorList(){
//	
//		return colorService.getColor();
//	
//	} 
//	
	@GetMapping("/accessory")
	public List<Accessory> fetchAccessoryList(){
	
		return accyService.getAccyList();
	
	} 

}
