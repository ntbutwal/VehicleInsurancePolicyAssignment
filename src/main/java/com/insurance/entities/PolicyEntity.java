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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ploicy")
public class PolicyEntity {

//	create table Policy(
//	id bigint not null auto_increment primary key,
//	Type varchar(50) not null,
//	Policy_No varchar(50) not null,
//	Start_Date date not null,
//	Expiry_date date not null,
//	Customer_Id bigint not null,
//	Is_Active boolean,
//	foreign key(Customer_Id) references Customer(id)

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

	@OneToOne
	@JoinColumn(name = "Customer_Id")
	private CustomerEntity customerEntity;

	@OneToMany(mappedBy = "policyEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<AdditionalDriversEntity> driversEntity;

	@OneToMany(mappedBy = "policyEntity", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<CoveredVehicleEntity> vehicleEntities;

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

	public CustomerEntity getCustomerEntity() {
		return customerEntity;
	}

	public void setCustomerEntity(CustomerEntity customerEntity) {
		this.customerEntity = customerEntity;
	}

	public List<AdditionalDriversEntity> getDriversEntity() {
		return driversEntity;
	}

	public void setDriversEntity(List<AdditionalDriversEntity> driversEntity) {
		this.driversEntity = driversEntity;
	}

	public List<CoveredVehicleEntity> getVehicleEntities() {
		return vehicleEntities;
	}

	public void setVehicleEntities(List<CoveredVehicleEntity> vehicleEntities) {
		this.vehicleEntities = vehicleEntities;
	}

	@Override
	public String toString() {
		return "PolicyEntity [id=" + id + ", type=" + type + ", policyNo=" + policyNo + ", startDate=" + startDate
				+ ", expiryDate=" + expiryDate + ", isActive=" + isActive + ", customerEntity=" + customerEntity
				+ ", driversEntity=" + driversEntity + ", vehicleEntities=" + vehicleEntities + "]";
	}

}
