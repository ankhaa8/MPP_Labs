package Lab9.prob7b;

import java.util.List;
import java.util.stream.Collectors;

public  class LambdaLibrary {
	public static final iFunction<List<Employee>,String> tri = (e)->{
		return e.stream()
		.filter(s->s.getSalary()>100000 && s.getLastName().charAt(0)>'M')
		.map(f -> f.getFirstName() + " " + f.getLastName())
		.sorted()
		.collect(Collectors.joining(", "));
	};
		
}
