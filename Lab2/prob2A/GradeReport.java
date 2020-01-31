package Lab2.prob2A;

public class GradeReport implements Comparable<GradeReport> {
	private String grade;
	private Student student;
	
	GradeReport(Student stu){
		student = stu;
	}
	
	public void setGrade(String g) {
		grade = g;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public Student getStudent() {
		return student;
	}	
	
	@Override
	public String toString() {
		return grade;
	}
	
	@Override
	public int compareTo(GradeReport o) {
		return grade.compareTo(o.grade);
	}
}
