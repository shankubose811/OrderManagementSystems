package com.OrderManagementSystem.app.OrderManagementSystem.Repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Accessory;
import com.OrderManagementSystem.app.OrderManagementSystem.Entity.Color;

@Repository 
public interface ColorRepo extends JpaRepository<Color, Integer> {

	
}
