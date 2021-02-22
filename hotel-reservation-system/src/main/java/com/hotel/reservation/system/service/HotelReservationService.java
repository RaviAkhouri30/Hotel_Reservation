package com.hotel.reservation.system.service;

import java.util.Map;

public interface HotelReservationService {

	public Map<Integer, String> getCity();
	
	public Map<Integer, String> findHotel(Integer cityId);
}
