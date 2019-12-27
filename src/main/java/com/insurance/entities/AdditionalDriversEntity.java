package com.insurance.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Additional_Drivers")
public class AdditionalDriversEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Additional_Drive_Name")
	private String name;

	@Column(name = "License_No")
	private String licenseNo;

	@Column(name = "Issued_State")
	private String issuedState;

	@Column(name = "Is_Active")
	private boolean isActive;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "Policy_Id")
	private PolicyEntity policy;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getIssuedState() {
		return issuedState;
	}

	public void setIssuedState(String issuedState) {
		this.issuedState = issuedState;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public PolicyEntity getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyEntity policy) {
		this.policy = policy;
	}

	@Override
	public String toString() {
		return "AdditionalDriversEntity [id=" + id + ", name=" + name + ", licenseNo=" + licenseNo + ", issuedState="
				+ issuedState + ", isActive=" + isActive + "]";
	}

}
