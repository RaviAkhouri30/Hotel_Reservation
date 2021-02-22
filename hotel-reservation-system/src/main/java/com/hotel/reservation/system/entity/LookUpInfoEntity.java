package com.hotel.reservation.system.entity;

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
@Table(name = "LOOKUP_INFO")
public class LookUpInfoEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOOKUP_INFO_ID")
	private Integer lookUpInfoId;
	
	@Column(name = "LOOKUP_INFO_NAME")
	private String lookUpInfoName;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LOOKUP_ID", referencedColumnName = "LOOKUP_ID")
	private LookUpEntity lookUpId;

	public LookUpInfoEntity() {
		super();
	}

	public Integer getLookUpInfoId() {
		return lookUpInfoId;
	}

	public void setLookUpInfoId(Integer lookUpInfoId) {
		this.lookUpInfoId = lookUpInfoId;
	}

	public String getLookUpInfoName() {
		return lookUpInfoName;
	}

	public void setLookUpInfoName(String lookUpInfoName) {
		this.lookUpInfoName = lookUpInfoName;
	}

	public LookUpEntity getLookUpId() {
		return lookUpId;
	}

	public void setLookUpId(LookUpEntity lookUpId) {
		this.lookUpId = lookUpId;
	}

	@Override
	public String toString() {
		return "LookUpInfoEntity [lookUpInfoId=" + lookUpInfoId + ", lookUpInfoName=" + lookUpInfoName + "]";
	}
	
}
