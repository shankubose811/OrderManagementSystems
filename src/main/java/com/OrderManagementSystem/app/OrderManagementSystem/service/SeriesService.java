package com.OrderManagementSystem.app.OrderManagementSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Accessory;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Series;

import com.OrderManagementSystem.app.OrderManagementSystem.Repo.SeriesRepo;


@Service
public class SeriesService {
	@Autowired 
	SeriesRepo repo;
	
	public List<Series> getSeriesList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

}
