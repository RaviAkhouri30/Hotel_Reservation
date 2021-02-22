package com.hotel.reservation.system.model;

import java.util.Date;

public class SearchHotelModel {

	private Integer cityId;
	
	private Integer hotelId;
	
	private Date date;

	public SearchHotelModel() {
		super();
	}

	public Integer getCityId() {
		return cityId;
	}

	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
}
