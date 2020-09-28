package be.abis.courseadmin.model;

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
					  float startingSalary) {
		this.firstNameInstructor = firstNameInstructor;
		this.lastNameInstructor = lastNameInstructor;
		this.ageInstructor = ageInstructor;
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
//        System.out.println("Start Working at : " + this.ageStartingAtAbis);
//        System.out.println("The salary at starting was  : " + this.startingSalary + " Euro");
//        System.out.println("The evolution of the salary : ");
//        printSalaryHistory();
        System.out.println("----------------------------------");
	}
	
	private void printSalaryHistory() {
		int seniority= 0;
		int age = ageStartingAtAbis;
		float salaryEvolution = startingSalary;
		String outputLine;
		while (age < ageInstructor) {
			outputLine = "Salary of " + this.firstNameInstructor + " " + this.lastNameInstructor + " at " + age + " is " + salaryEvolution;
			System.out.println(outputLine);
			age += 5;
			seniority += 5;
			if (seniority <= 35) {
				salaryEvolution *= 1.03f;
			} else {
				outputLine = "Maximum salary reached" + System.lineSeparator();
				System.out.println(outputLine);
				break;
			}
		}
	}
}
