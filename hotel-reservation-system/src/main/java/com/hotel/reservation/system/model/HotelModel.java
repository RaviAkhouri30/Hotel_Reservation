package com.hotel.reservation.system.model;

import java.io.Serializable;

public class HotelModel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private Integer hotelId;
	
	private String hotelName;
	
	public HotelModel() {
		super();
	}

	public Integer getHotelId() {
		return hotelId;
	}

	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

}
