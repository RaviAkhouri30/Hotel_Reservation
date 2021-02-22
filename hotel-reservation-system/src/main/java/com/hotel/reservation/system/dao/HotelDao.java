package com.hotel.reservation.system.dao;

import java.util.List;

import com.hotel.reservation.system.entity.HotelEntity;

public interface HotelDao {

	List<HotelEntity> findHotelByCityId(Integer cityId);
	
}
