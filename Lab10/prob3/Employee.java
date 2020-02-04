package Lab10.prob3;

public class Employee {
	int id;
	String name;
	int salary;
	
	public Employee(int id, String n, int s) {
		this.name = n;
		this.id = id;
		this.salary = s;
		
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("<");
		sb.append("name: ");
		sb.append(getName());
		sb.append(" salary: ");
		sb.append("" + salary);
		sb.append(" year of birth: ");
		return sb.toString();
		
	}


	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
