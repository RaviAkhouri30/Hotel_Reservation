package com.hotel.reservation.system.entity;

import java.util.Date;

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
@Table(name = "BOOKING")
public class BookingEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "BOOKING_ID")
	private Integer bookingId;
	
	@Column(name = "BOOKING_NO")
	private String bookingNo;
	
	@Column(name = "GUEST_NAME")
	private String guestName;
	
	@Column(name = "AGE")
	private Integer age;
	
	@Column(name = "EMAIL_ID")
	private String emailId;
	
	@Column(name = "MOBILE_NO")
	private String mobileNo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ROOM_TYPE_ID", referencedColumnName = "LOOKUP_INFO_ID")
	private LookUpInfoEntity roomTypeId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "HOTEL_ID", referencedColumnName = "HOTEL_ID")
	private HotelEntity hotelId;
	
	private Date createdDate;
	
	private Integer activeStatus;

	public BookingEntity() {
		super();
	}

	public Integer getBookingId() {
		return bookingId;
	}

	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingNo() {
		return bookingNo;
	}

	public void setBookingNo(String bookingNo) {
		this.bookingNo = bookingNo;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public LookUpInfoEntity getRoomTypeId() {
		return roomTypeId;
	}

	public void setRoomTypeId(LookUpInfoEntity roomTypeId) {
		this.roomTypeId = roomTypeId;
	}

	public HotelEntity getHotelId() {
		return hotelId;
	}

	public void setHotelId(HotelEntity hotelId) {
		this.hotelId = hotelId;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getActiveStatus() {
		return activeStatus;
	}

	public void setActiveStatus(Integer activeStatus) {
		this.activeStatus = activeStatus;
	}

	@Override
	public String toString() {
		return "BookingEntity [bookingId=" + bookingId + ", bookingNo=" + bookingNo + ", guestName=" + guestName
				+ ", age=" + age + ", emailId=" + emailId + ", mobileNo=" + mobileNo + ", createdDate=" + createdDate
				+ ", activeStatus=" + activeStatus + "]";
	}
	
}
