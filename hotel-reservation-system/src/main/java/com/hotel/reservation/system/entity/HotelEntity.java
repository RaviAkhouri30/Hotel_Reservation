package com.hotel.reservation.system.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "HOTEL")
public class HotelEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "HOTEL_ID")
	private Integer hotelId;
	
	@Column(name = "HOTEL_NAME")
	private String hotelName;
	
	@Column(name = "NO_OF_ROOMS")
	private Integer noOfRooms;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROOM_TYPE_ID", referencedColumnName = "LOOKUP_INFO_ID")
	private LookUpInfoEntity roomTypeId;
	
	@Column(name = "PRICE")
	private Integer price;
	
	@Column(name = "GST")
	private Float gst;
	
	@Column(name = "TOTAL")
	private Float total;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CITY_ID", referencedColumnName = "CITY_ID")
	private CityEntity cityId;

	public HotelEntity() {
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

	public Integer getNoOfRooms() {
		return noOfRooms;
	}

	public void setNoOfRooms(Integer noOfRooms) {
		this.noOfRooms = noOfRooms;
	}

	public LookUpInfoEntity getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(LookUpInfoEntity roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Float getGst() {
		return gst;
	}

	public void setGst(Float gst) {
		this.gst = gst;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	public CityEntity getCityId() {
		return cityId;
	}

	public void setCityId(CityEntity cityId) {
		this.cityId = cityId;
	}

	@Override
	public String toString() {
		return "HotelEntity [hotelId=" + hotelId + ", hotelName=" + hotelName + ", noOfRooms=" + noOfRooms + ", price="
				+ price + ", gst=" + gst + ", total=" + total + "]";
	}
	
}
