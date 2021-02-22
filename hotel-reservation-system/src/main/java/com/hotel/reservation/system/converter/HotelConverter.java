package com.hotel.reservation.system.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.hotel.reservation.system.entity.HotelEntity;
import com.hotel.reservation.system.model.HotelModel;

@Component
public class HotelConverter {

	public HotelModel toHotelModel(HotelEntity entity) {
		HotelModel model = new HotelModel();
		model.setHotelId(entity.getHotelId());
		model.setHotelName(entity.getHotelName());
		return model;
	}
	
	public List<HotelModel> toHotelModel(List<HotelEntity> entity) {
		return entity.stream().map(hotelEntity -> this.toHotelModel(hotelEntity)).collect(Collectors.toList());
	}
	
}
