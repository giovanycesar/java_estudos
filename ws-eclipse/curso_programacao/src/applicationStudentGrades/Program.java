package applicationStudentGrades;

import java.util.Locale;
import java.util.Scanner;

import entitiesStudentGrades.StudentGrades;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		StudentGrades aluno;
		aluno = new StudentGrades();

		System.out.print("Name: ");
		aluno.name = sc.nextLine();
		
		System.out.print("Grade 01: ");
		aluno.grade01 = sc.nextDouble();
		
		System.out.print("Grade 02: ");
		aluno.grade02 = sc.nextDouble();
		
		System.out.print("Grade 03: ");
		aluno.grade03 = sc.nextDouble();

		System.out.println();
		System.out.printf("Final grade: %.2f%n", aluno.finalGrade());
		aluno.passFailed();
		
		sc.close();

	}

}
