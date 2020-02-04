package Lab9.prob10;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

class Human {
	String name;
	int age;
	String gender;

	public Human(String name) {
		this.name = name;
	}

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Human(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
}

public class ConstructorReference {
	public static void main(String args[]) {
		Human[] list = { new Human("Joe", 35, "Male"), new Human("Jane", 45, "Female"), new Human("John", 30, "Male") };
		List<Human> hlist = Arrays.asList(list);
		// Query 1 : Print only Female canditates names
		System.out.println("Query 1:");
		hlist.stream().filter(g -> g.getGender().equals("Female")).map(Human::getName).forEach(System.out::println);

		// Query 2 : Cretae an objecy by choosing suitable Interface to the specified
		// constructors(Totally 3 constuctors)using fouth type of Method Reference
		// ClassName::new. Then print the object status
		System.out.println("\nQuery 2:");
		Function<String, Human> function1 = Human::new;
		Human ob = function1.apply("John");
		System.out.print("Function1: ");
	    System.out.println(ob);
	    
		BiFunction<String, Integer, Human> function2 = Human::new;
		ob = function2.apply("Smith", 28);
		System.out.print("Function2: ");
		System.out.println(ob);
		
		TriFunction<String, Integer, String, Human> function3 = Human::new;
		ob = function3.apply("Tom", 25, "Male");
		System.out.print("Function3: ");
		System.out.println(ob);
		// Query 3 : Count the male candidates whose age is more than 30
		System.out.println("\nQuery 3:");
		System.out.println(hlist.stream().filter(g -> g.getGender().equals("Male")).filter(a->a.getAge()>30).count());
	}

}
