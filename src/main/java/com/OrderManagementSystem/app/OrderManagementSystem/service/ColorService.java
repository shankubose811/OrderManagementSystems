package com.OrderManagementSystem.app.OrderManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Accessory;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Color;
import com.OrderManagementSystem.app.OrderManagementSystem.Repo.ColorRepo;

@Service
public class ColorService {

	@Autowired 
	ColorRepo repo;
	
	public List<Color> getColorList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	
}
