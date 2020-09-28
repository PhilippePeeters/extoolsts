package be.abis.exjava.model;

public class Company {

	private String name;
	private Address addressCompany;
	
	public Company(String name, Address addressCompany) {
		super();
		this.name = name;
		this.addressCompany = addressCompany;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddressCompany() {
		return addressCompany;
	}

	public void setAddressCompany(Address addressCompany) {
		this.addressCompany = addressCompany;
	}
	
	public String toString() {
		return "Company " + this.name + addressCompany.toString();
	}
}
