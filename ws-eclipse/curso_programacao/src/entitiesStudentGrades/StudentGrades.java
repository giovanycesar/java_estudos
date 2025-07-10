package entitiesStudentGrades;

public class StudentGrades {

	public String name;
	public double grade01;
	public double grade02;
	public double grade03;

	public double finalGrade() {

		return grade01 + grade02 + grade03;

	}

	public void passFailed() {

		if (finalGrade() >= 60) {
			System.out.println("Status: PASS");
		} else {
			double missing = 60 - finalGrade();
			System.out.printf("Status: FAILED, missing %.2f points", missing);
		}

	}

}
