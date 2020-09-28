package be.abis.exjava.test;

import java.time.LocalDate;

import be.abis.exjava.model.Address;
import be.abis.exjava.model.Company;
import be.abis.exjava.model.Person;

public class Test {

	public static void main(String[] args) {

		Address adr1 = new Address("Leuvenstraat","69","5236","Leuven","Belgium","BE");
		Company comp1 = new Company("Abis", adr1);
		Person pers1 = new Person(1, "Ann", "Smits", LocalDate.of(1985,1,1), comp1);
		System.out.println(pers1.toString());

		Person pers2 = new Person(2, "John", "Doe", LocalDate.of(1966,1,1), null);
		System.out.println(pers2.toString());
	}

}
