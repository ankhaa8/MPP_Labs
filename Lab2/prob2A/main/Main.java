package Lab2.prob2A.main;

import java.util.Arrays;
import java.util.List;

import Lab2.prob2A.Student;

public class Main {

	public static void main(String[] args) {

		Student st1 = new Student("Han");
		Student st2 = new Student("John");
		Student st3 = new Student("Kenny");
		List<Student> students = Arrays.asList(st1, st2, st3);
		String[] grades = new String[]{"A+", "A-", "A+"};
		
		for(int i = 0; i < grades.length; ++i) {
			students.get(i).getGradeReport().setGrade(grades[i]);
		}
		
		System.out.println("Students and their grade reports: " + students);
	

	}
}
