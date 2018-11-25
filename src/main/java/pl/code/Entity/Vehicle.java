package pl.code.Entity;

import java.sql.Timestamp;

public class Vehicle {

	private Long id;
	private String carModel;
	private String carBrand;
	private Timestamp productionYear;
	private String registrationNumber;
	private Timestamp nextTechnicalInspection;
	private Customer customer;

	public Vehicle(Long id, String carModel, String carBrand, Timestamp productionYear, String registrationNumber, Timestamp nextTechnicalInspection, Customer customer) {
		this.id = id;
		this.carModel = carModel;
		this.carBrand = carBrand;
		this.productionYear = productionYear;
		this.registrationNumber = registrationNumber;
		this.nextTechnicalInspection = nextTechnicalInspection;
		this.customer = customer;
	}

	public Vehicle() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public Timestamp getProductionYear() {
		return productionYear;
	}

	public void setProductionYear(Timestamp productionYear) {
		this.productionYear = productionYear;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public Timestamp getNextTechnicalInspection() {
		return nextTechnicalInspection;
	}

	public void setNextTechnicalInspection(Timestamp nextTechnicalInspection) {
		this.nextTechnicalInspection = nextTechnicalInspection;
	}
}
