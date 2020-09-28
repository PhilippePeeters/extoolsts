package be.abis.exjava.model;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class Instructor {


	private String firstNameInstructor = null;
	private String lastNameInstructor = null;
	private int ageInstructor = 0;
	private int ageStartingAtAbis = 0;
	private float startingSalary = 0.0f;
	
	public Instructor() {
		super();
	}
	
	public Instructor(String firstNameInstructor,
					  String lastNameInstructor,
					  int ageInstructor,
					  int ageStartingAtAbis,
					  float startingSalary) throws AgeCannotBeNegativeException {
		
		this.firstNameInstructor = firstNameInstructor;
		this.lastNameInstructor = lastNameInstructor;
		if (ageInstructor < 0) {
			throw new AgeCannotBeNegativeException("Age of Instructor" + this.firstNameInstructor + " " + this.lastNameInstructor + " can't be negative ! " + ageInstructor);
		} else {
			this.ageInstructor = ageInstructor;
		}
		this.ageStartingAtAbis = ageStartingAtAbis;
		this.startingSalary = startingSalary;
		
	}
	
	public String getFirstNameInstructor() {
		return firstNameInstructor;
	}

	public void setFirstNameInstructor(String firstNameInstructor) {
		this.firstNameInstructor = firstNameInstructor;
	}

	public String getLastNameInstructor() {
		return lastNameInstructor;
	}

	public void setLastNameInstructor(String lastNameInstructor) {
		this.lastNameInstructor = lastNameInstructor;
	}

	public int getAgeInstructor() {
		return ageInstructor;
	}

	public void setAgeInstructor(int ageInstructor) {
		this.ageInstructor = ageInstructor;
	}

	public int getAgeStartingAtAbis() {
		return ageStartingAtAbis;
	}

	public void setAgeStartingAtAbis(int ageStartingAtAbis) {
		this.ageStartingAtAbis = ageStartingAtAbis;
	}

	public float getStartingSalary() {
		return startingSalary;
	}

	public void setStartingSalary(float startingSalary) {
		this.startingSalary = startingSalary;
	}

	public void printInfo() {
        System.out.println("InstructorName : " + this.firstNameInstructor + " " + this.lastNameInstructor + " " + this.ageInstructor + " ans");
        System.out.println("Start Working at : " + this.ageStartingAtAbis);
        System.out.println("The salary at starting was  : " + this.startingSalary + " Euro");
        System.out.println("The evolution of the salary : ");
        printSalaryHistory();
        System.out.println("----------------------------------");
	}
	
	public String toString() {
        return "InstructorName : " + this.firstNameInstructor + " " + this.lastNameInstructor + " " + this.ageInstructor + " ans";
	}
	
	
	private void printSalaryHistory(String outputFileName) {
		int seniority= 0;
		int age = ageStartingAtAbis;
		float salaryEvolution = startingSalary;
		String outputLine;
		ArrayList<String> outputSalaryList = new ArrayList<String>();
		while (age < ageInstructor) {
			outputLine = "Salary of " + this.firstNameInstructor + " " + this.lastNameInstructor + " at " + age + " is " + salaryEvolution + System.lineSeparator();
			System.out.println(outputLine);
			outputSalaryList.add(outputLine);
			age += 5;
			seniority += 5;
			if (seniority <= 35) {
				salaryEvolution *= 1.03f;
			} else {
				outputLine = "Maximum salary reached" + System.lineSeparator();
				System.out.println(outputLine);
				outputSalaryList.add(outputLine);
				break;
			}
		}
		writeToFile(outputSalaryList, outputFileName);
	}
	
	private void printSalaryHistory() {
		String outputFileName = "C:\\Users\\Administrateur.000\\git\\extoolsts\\exG2\\salaryhistoryof" + this.lastNameInstructor + ".txt";	
		printSalaryHistory(outputFileName);
	}
	
	private static void writeToFile(ArrayList<String> content, String fileName) {
		Path pathToFile= Paths.get(fileName);
		try (BufferedWriter writer = Files.newBufferedWriter(pathToFile)){
			for(String line: content) {
				  writer.write(line);
			}
			System.out.println("Content written to " + pathToFile  );
			writer.close();
		} catch (IOException e) {
			System.out.println("Could not write file to " + pathToFile);
			e.printStackTrace();
		} 
	}

}

