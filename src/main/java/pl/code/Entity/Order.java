package pl.code.Entity;

import java.sql.Timestamp;

public class Order {

	private Long id;
	private Timestamp acceptanceDate;
	private Timestamp planedStartDate;
	private Timestamp startRepairDate;
	private Employee employee;
	private String problemDescription;
	private String repairDescription;
	private Status status;
	private Vehicle vehicle;
	private Double customerCost;
	private Double usedPartsCost;
	private Double manHourCost;
	private Double manHourQuantity;

	public Order(Long id, Timestamp acceptanceDate, Timestamp planedStartDate,
	             Timestamp startRepairDate, Employee employee, String problemDescription,
	             String repairDescription, Status status, Vehicle vehicle, Double customerCost,
	             Double usedPartsCost, Double manHourCost, Double manHourQuantity) {
		this.id = id;
		this.acceptanceDate = acceptanceDate;
		this.planedStartDate = planedStartDate;
		this.startRepairDate = startRepairDate;
		this.employee = employee;
		this.problemDescription = problemDescription;
		this.repairDescription = repairDescription;
		this.status = status;
		this.vehicle = vehicle;
		this.customerCost = customerCost;
		this.usedPartsCost = usedPartsCost;
		this.manHourCost = manHourCost;
		this.manHourQuantity = manHourQuantity;
	}

	public Order() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Timestamp getAcceptanceDate() {
		return acceptanceDate;
	}

	public void setAcceptanceDate(Timestamp acceptanceDate) {
		this.acceptanceDate = acceptanceDate;
	}

	public Timestamp getPlanedStartDate() {
		return planedStartDate;
	}

	public void setPlanedStartDate(Timestamp planedStartDate) {
		this.planedStartDate = planedStartDate;
	}

	public Timestamp getStartRepairDate() {
		return startRepairDate;
	}

	public void setStartRepairDate(Timestamp startRepairDate) {
		this.startRepairDate = startRepairDate;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getProblemDescription() {
		return problemDescription;
	}

	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}

	public String getRepairDescription() {
		return repairDescription;
	}

	public void setRepairDescription(String repairDescription) {
		this.repairDescription = repairDescription;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public Double getCustomerCost() {
		return customerCost;
	}

	public void setCustomerCost(Double customerCost) {
		this.customerCost = customerCost;
	}

	public Double getUsedPartsCost() {
		return usedPartsCost;
	}

	public void setUsedPartsCost(Double usedPartsCost) {
		this.usedPartsCost = usedPartsCost;
	}

	public Double getManHourCost() {
		return manHourCost;
	}

	public void setManHourCost(Double manHourCost) {
		this.manHourCost = manHourCost;
	}

	public Double getManHourQuantity() {
		return manHourQuantity;
	}

	public void setManHourQuantity(Double manHourQuantity) {
		this.manHourQuantity = manHourQuantity;
	}
}
