package Lab2.prob2A;

public class Student {
	private String name;
	private GradeReport gradereport;
	
	public Student(String n){
		name = n;
		gradereport = new GradeReport(this);
	}
	
	public String getName() {
		return this.name;
	}
	
	public GradeReport getGradeReport() {
		return gradereport;
	}
	
	@Override
	public String toString() {
		return name + ": " + gradereport.getGrade();
	}
	
}
