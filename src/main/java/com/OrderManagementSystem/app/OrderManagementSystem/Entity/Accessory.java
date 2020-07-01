package com.OrderManagementSystem.app.OrderManagementSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accy")
public class Accessory {
	
	@Id
	@Column(name="accy_id")
	private Integer accyId;
	
	@Column(name="a_name")
	private String accyName;
	
	@Column(name="a_price")
	private Integer accyPrice;
	

	@Column(name="model_model_id")
	private Integer modelId;
	
	public Accessory() {
		super();
	}


	public Accessory(String accyName, Integer accyPrice, Integer modelId) {
		super();
		this.accyName = accyName;
		this.accyPrice = accyPrice;
		this.modelId = modelId;
	}


	public Integer getAccyId() {
		return accyId;
	}


	public void setAccyId(Integer accyId) {
		this.accyId = accyId;
	}


	public String getAccyName() {
		return accyName;
	}


	public void setAccyName(String accyName) {
		this.accyName = accyName;
	}


	public Integer getAccyPrice() {
		return accyPrice;
	}


	public void setAccyPrice(Integer accyPrice) {
		this.accyPrice = accyPrice;
	}


	public Integer getModelId() {
		return modelId;
	}


	public void setModelId(Integer modelId) {
		this.modelId = modelId;
	}



}
