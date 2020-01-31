package Lab8.day2.prob1;

import java.util.function.Predicate;

public class MyClass {
	int x;
	String y;
	
	public MyClass(int x, String y) {
		this.x = x;
		this.y = y;
	}
	
	public void myMethod(MyClass cl) {
		Predicate<MyClass> p2 = this::equals;
		System.out.println("Is this instance equal to cl? " + p2.test(cl));
	}
	
	@Override
	public boolean equals(Object ob) {
		if(ob == null) return false;
		if(ob.getClass() != getClass()) return false;
		MyClass mc = (MyClass)ob;
		return mc.x == x && mc.y.equals(y);
	}

	public static void main(String[] args) {
		MyClass myclass1 = new MyClass(100, "ABC");
		MyClass myclass2 = new MyClass(101, "BAC");
		myclass1.myMethod(myclass1);
		myclass1.myMethod(myclass2);

	}

}

