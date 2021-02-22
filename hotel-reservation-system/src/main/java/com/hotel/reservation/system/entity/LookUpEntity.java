package com.hotel.reservation.system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "LOOKUP")
public class LookUpEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOOKUP_ID")
	private Integer lookUpId;
	
	@Column(name = "LOOKUP_NAME")
	private String lookUpName;

	public LookUpEntity() {
		super();
	}

	public Integer getLookUpId() {
		return lookUpId;
	}

	public void setLookUpId(Integer lookUpId) {
		this.lookUpId = lookUpId;
	}

	public String getLookUpName() {
		return lookUpName;
	}

	public void setLookUpName(String lookUpName) {
		this.lookUpName = lookUpName;
	}

	@Override
	public String toString() {
		return "LookUp [lookUpId=" + lookUpId + ", lookUpName=" + lookUpName + "]";
	}
}
