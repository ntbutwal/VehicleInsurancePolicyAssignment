package com.insurance.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Covered_Vehicle")
public class CoveredVehicleEntity {

//			create table Covered_Vehicle(
//			id bigint not null auto_increment primary key,
//			VIN varchar(50) not null,
//			Make varchar(40) not null,
//			Model varchar(40) not null,
//			Year varchar(10) not null,
//			Is_Active boolean,
//			Policy_Id bigint not null,
//			foreign keyAdditional_Drivers(Policy_Id) references Policy(id)
//			);

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "VIN")
	private String vin;

	@Column(name = "Make")
	private String make;

	@Column(name = "Model")
	private String model;

	@Column(name = "Year")
	private String year;

	@Column(name = "Is_Active")
	private boolean isActive;

	@OneToOne
	@JoinColumn(name = "Policy_Id")
	private PolicyEntity policyEntity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public PolicyEntity getPolicyEntity() {
		return policyEntity;
	}

	public void setPolicyEntity(PolicyEntity policyEntity) {
		this.policyEntity = policyEntity;
	}

	@Override
	public String toString() {
		return "CoveredVehicleEntity [id=" + id + ", vin=" + vin + ", make=" + make + ", model=" + model + ", year="
				+ year + ", isActive=" + isActive + ", policyEntity=" + policyEntity + "]";
	}

}
