package be.abis.exjava.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {

	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Company company;
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate, Company company) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.company = company;
 	}

	

	public Person(int personNumber, String firstName, String lastName) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}



	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	} 

	public String toString() {
		String outString = "Name : " + this.firstName + " " + this.lastName + " " + calculateAge() + " years Old" + " ";
		if (this.company != null) {
			outString += company;
		}
		return outString;
	}
	
	public int calculateAge()  {
        Period diffAge = null;
        if(this.birthDate != null){
            diffAge = Period.between(this.birthDate,LocalDate.now());
        }
        return diffAge.getYears();
	}
}
