package com.OrderManagementSystem.app.OrderManagementSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="series")
public class Series {

	@Id
	@Column(name="series_id")
	private Integer seriesId;

	@Column(name="s_name")
	private String sName;


	public Series(String sName) {
		super();
		this.sName = sName;
	}


	public Integer getSeriesId() {
		return seriesId;
	}


	public void setSeriesId(Integer seriesId) {
		this.seriesId = seriesId;
	}


	public String getsName() {
		return sName;
	}


	public void setsName(String sName) {
		this.sName = sName;
	}


	public Series() {
		super();
	}
	
}
