package com.hotel.reservation.system.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hotel.reservation.system.converter.HotelConverter;
import com.hotel.reservation.system.dao.CityDao;
import com.hotel.reservation.system.dao.HotelDao;
import com.hotel.reservation.system.entity.CityEntity;
import com.hotel.reservation.system.entity.HotelEntity;
import com.hotel.reservation.system.model.HotelModel;

@Service
public class HotelReservationServiceImpl implements HotelReservationService {

	@Autowired
	private CityDao cityDao;
	
	@Autowired
	private HotelDao hotelDao;
	
	@Autowired
	private HotelConverter hotelConverter; 
	
	@Transactional
	@Override
	public Map<Integer, String> getCity() {
		Map<Integer, String> cityMap = new HashMap<>();
		List<CityEntity> cityEntityList = this.cityDao.getCity();
		cityEntityList.forEach(cityEntity -> cityMap.put(cityEntity.getCityId(), cityEntity.getCityName()));
		return cityMap;
	}

	@Transactional
	@Override
	public Map<Integer, String> findHotel(Integer cityId) {
		Map<Integer, String> hotelMap = new HashMap<>();
		List<HotelEntity> hotelEntityList = this.hotelDao.findHotelByCityId(cityId);
		hotelEntityList.forEach(hotelEntity -> hotelMap.put(hotelEntity.getHotelId(), hotelEntity.getHotelName()));
		return hotelMap;
	}

}
