package be.abis.exjava.model;

import java.util.HashSet;
import java.util.Iterator;

public class Course {

	private String titleCourse;
	private int numberOfDayCourse;
	private int priceOfCoursePerDay;
	private boolean priorKnowledgeOfCourse;
	private HashSet<Instructor> contentListInstructors;
	
	public Course(String titleCourse, int numberOfDayCourse, int priceOfCoursePerDay, boolean priorKnowledgeOfCourse) {
		this.titleCourse = titleCourse;
		this.numberOfDayCourse = numberOfDayCourse;
		this.priceOfCoursePerDay = priceOfCoursePerDay;
		this.priorKnowledgeOfCourse = priorKnowledgeOfCourse;
		this.contentListInstructors = new HashSet<Instructor>();
	}

	public String getTitleCourse() {
		return titleCourse;
	}

	public void setTitleCourse(String titleCourse) {
		this.titleCourse = titleCourse;
	}

	public int getNumberOfDayCourse() {
		return numberOfDayCourse;
	}

	public void setNumberOfDayCourse(int numberOfDayCourse) {
		this.numberOfDayCourse = numberOfDayCourse;
	}

	public int getPriceOfCoursePerDay() {
		return priceOfCoursePerDay;
	}

	public void setPriceOfCoursePerDay(int priceOfCoursePerDay) {
		this.priceOfCoursePerDay = priceOfCoursePerDay;
	}

	public boolean isPriorKnowledgeOfCourse() {
		return priorKnowledgeOfCourse;
	}

	public void setPriorKnowledgeOfCourse(boolean priorKnowledgeOfCourse) {
		this.priorKnowledgeOfCourse = priorKnowledgeOfCourse;
	}

	public HashSet<Instructor> getContentListInstructors() {
		return contentListInstructors;
	}

	public void setContentListInstructors(HashSet<Instructor> contentListInstructors) {
		this.contentListInstructors = contentListInstructors;
	}

	public void addInstructor(Instructor instructor) {
		contentListInstructors.add(instructor);
		System.out.println("Instructor : " + instructor.getFirstNameInstructor() + " " + instructor.getLastNameInstructor() + " added to the course !");
	}
	
	public void removeInstructor(Instructor instructor) {
		contentListInstructors.remove(instructor);
		System.out.println("Instructor : " + instructor.getFirstNameInstructor() + " " + instructor.getLastNameInstructor() + " removed from the course!");
	}

	public void printInfo() {
		String label;
		float priceOfCourseVatIncluded = totalPriceCalculation();

		if (priceOfCourseVatIncluded < 500) {
			label = " CHEAP";
		} else if (priceOfCourseVatIncluded < 1500) {
				label = " OK";
		} else {
				label = " EXPENSIVE";
		}

		System.out.println("Title : " + titleCourse + label);
		printInstructors();
		System.out.println("Number of day  : " + numberOfDayCourse);
		System.out.println("Price : " + priceOfCoursePerDay);
		System.out.println("Is prior knowledge needed : " + priorKnowledgeOfCourse);
		System.out.println("The price is : " + priceOfCourseVatIncluded + " Euro");
        System.out.println("**********************************");		
	}
	
	private float totalPriceCalculation() {
		int priceOfCourse = 0;
		float priceOfCourseVatIncluded = 0.0f;
		float priceOfVat = 0.0f;

		priceOfVat = 0;
		priceOfCourse = this.numberOfDayCourse * this.priceOfCoursePerDay;
		if (this.numberOfDayCourse > 3 && this.priorKnowledgeOfCourse) {
			System.out.println("No VAT !");
		} else {
			priceOfVat = (( (float) priceOfCourse * 21) / 100);
		}
		return priceOfCourseVatIncluded = priceOfCourse + priceOfVat;
	}
	
	private void printInstructors() {
		Iterator<Instructor> itInstructor = contentListInstructors.iterator();
		System.out.println("There are " + contentListInstructors.size() + " instructors for this course");
		Instructor instr = new Instructor();
		while (itInstructor.hasNext()) { 
            instr =  itInstructor.next();
            System.out.println(instr.toString());
        } 
	}
}
