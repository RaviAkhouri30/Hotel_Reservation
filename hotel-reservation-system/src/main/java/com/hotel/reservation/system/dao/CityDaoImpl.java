package com.hotel.reservation.system.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotel.reservation.system.entity.CityEntity;

@Repository
public class CityDaoImpl implements CityDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<CityEntity> getCity() {
		Session currentSession = this.sessionFactory.getCurrentSession(); 
		Query<CityEntity> city = currentSession.createQuery("from CityEntity", CityEntity.class);
		List<CityEntity> cityList = city.getResultList();
		return cityList;
	}
	
}
