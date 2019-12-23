package com.insurance.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ploicy")
public class PolicyEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "Type")
	private String type;

	@Column(name = "Policy_No")
	private String policyNo;

	@Column(name = "Start_Date")
	private Date startDate;

	@Column(name = "Expiry_date")
	private Date expiryDate;

	@Column(name = "Is_Active")
	private boolean isActive;

	@ManyToOne
	@JoinColumn(name = "Customer_Id")
	private CustomerEntity customer;

	@OneToMany(mappedBy = "policy", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AdditionalDriversEntity> drivers;

	@OneToMany(mappedBy = "policyv", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CoveredVehicleEntity> vehicle;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public CustomerEntity getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerEntity customer) {
		this.customer = customer;
	}

	public List<AdditionalDriversEntity> getDrivers() {
		return drivers;
	}

	public void setDrivers(List<AdditionalDriversEntity> drivers) {
		this.drivers = drivers;
	}

	public List<CoveredVehicleEntity> getVehicle() {
		return vehicle;
	}

	public void setVehicle(List<CoveredVehicleEntity> vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "PolicyEntity [id=" + id + ", type=" + type + ", policyNo=" + policyNo + ", startDate=" + startDate
				+ ", expiryDate=" + expiryDate + ", isActive=" + isActive + ", customer=" + customer + ", drivers="
				+ drivers + ", vehicle=" + vehicle + "]";
	}

}
