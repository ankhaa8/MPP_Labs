package Lab10.prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class ContainMain {
	public static <T> boolean contains(List<? extends T> list, T ob,	BiPredicate<? super T,? super T> biP) {
		for(T x: list) {
			if(biP.test(x, ob)) {
				return true;
			}
		}
		return false;
		
	}
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(1003, "Tom", 68000));
		list.add(new Employee(1002, "Smith", 75000));
		list.add(new Employee(1001, "Joe", 58000));
		Employee emp = new Employee(1001, "Joe", 50000);
		boolean foundIt = contains(list, emp, (Employee e1, Employee e2) -> e1.getId() == e2.getId());
		System.out.println(foundIt);	
		
		List<Account> alist = new ArrayList<>();
		alist.add(new Account(1001, 25.00));
		alist.add(new Account(1002, 35.00));
		alist.add(new Account(1003, 125.00));
		
		Account acc = new CheckingAccount(1003, 125.00);
		boolean foundIta = contains(alist, acc, (Account a1, Account a2) -> a1.getAcctId() == a2.getAcctId());
		System.out.println(foundIta);	
	}

}
