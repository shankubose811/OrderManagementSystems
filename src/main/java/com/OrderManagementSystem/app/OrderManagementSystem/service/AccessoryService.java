package com.OrderManagementSystem.app.OrderManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Accessory;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Series;
import com.OrderManagementSystem.app.OrderManagementSystem.Repo.AccessoryRepo;

@Service
public class AccessoryService {

	@Autowired 
	AccessoryRepo repo;
	
	public List<Accessory> getAccyList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
