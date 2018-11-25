package pl.code.Entity;

public class Employee {

	private Long id;
	private String name;
	private String surname;
	private String address;
	private Integer phoneNumber;
	private String note;
	private Double manHourCost;

	public Employee(Long id, String name, String surname, String address, Integer phoneNumber, String note, Double manHourCost) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.note = note;
		this.manHourCost = manHourCost;
	}

	public Employee() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Double getManHourCost() {
		return manHourCost;
	}

	public void setManHourCost(Double manHourCost) {
		this.manHourCost = manHourCost;
	}
}
