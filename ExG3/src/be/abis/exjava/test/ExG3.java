package be.abis.exjava.test;

import be.abis.exjava.model.AgeCannotBeNegativeException;
import be.abis.exjava.model.Course;
import be.abis.exjava.model.Instructor;

public class ExG3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creation of all instructor
		Instructor i1 = null;
		Instructor i2 = null;
		Instructor i3 = null;
		Instructor i4 = null;
		Instructor i5 = null;
		Instructor i6 = null;
		Instructor i7 = null;
		Instructor i8 = null;
		Instructor i9 = null;
		try {
			i1 = new Instructor("Philippe", "PEETERS", 65, 23, 2000);
			i2 = new Instructor("Patrick", "ROULET", 60, 25, 5000);
			i3 = new Instructor("Bruno", "ZEGHERS", 69, 25, 8000);
			i4 = new Instructor("Grietje", "COSTERMANS", 50, 23, 8000);
			i5 = new Instructor("Thierry", "BOSMANS", -55, 30, 8000);
			i6 = new Instructor("Peter", "OTTO", 25, 18, 8000);
			i7 = new Instructor("Bart", "VAN ROOY", 45, 20, 8000);
			i8 = new Instructor("Sandy", "SCHILLEBEECKX", 35, 23, 8000);
			i9 = new Instructor("Cecile", "NAVEZ", 35, 23, 8000);
		} catch (AgeCannotBeNegativeException e) {
			System.out.println("Error : " + e.toString());
			System.exit(1);
		}
		
		// Creation Courses wiht link on instructors
		Course c1 = new Course("Java Training", 5, 55, true);
		c1.addInstructor(i1);
		c1.addInstructor(i3);
		c1.addInstructor(i2);
		c1.printInfo();

		Course c2 = new Course("Git Training", 7, 250, true);
		c2.addInstructor(i4);
		c2.addInstructor(i9);
		c2.printInfo();

		Course c3 = new Course("Set up your Java development environment ", 2, 25, false);
		c3.addInstructor(i6);
		c3.addInstructor(i5);
		c3.addInstructor(i8);
		c3.addInstructor(i7);
		c3.removeInstructor(i8);
		c3.printInfo();
		
		// Info instructor only 
		i1.printInfo();
		i4.printInfo();
	}
}
