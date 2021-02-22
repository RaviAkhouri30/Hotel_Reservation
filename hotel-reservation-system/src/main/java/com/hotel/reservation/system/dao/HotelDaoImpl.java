package com.hotel.reservation.system.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotel.reservation.system.entity.HotelEntity;

@Repository
public class HotelDaoImpl implements HotelDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<HotelEntity> findHotelByCityId(Integer cityId) {
		Session currentSession = this.sessionFactory.getCurrentSession();
		List<HotelEntity> hotelEntityList = currentSession
				.createQuery("select h from HotelEntity h where h.cityId.cityId = :cityId", HotelEntity.class)
				.setParameter("cityId", cityId).getResultList();
		return hotelEntityList;
	}

}
