package Lab9.prob8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PuttingIntoPractice{
    public static void main(String ...args){    
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");
		
		List<Transaction> transactions = Arrays.asList(
            new Transaction(brian, 2011, 300), 
            new Transaction(raoul, 2012, 1000),
            new Transaction(raoul, 2011, 400),
            new Transaction(mario, 2012, 710),	
            new Transaction(mario, 2012, 700),
            new Transaction(alan, 2012, 950)
        );	
        
        
        // Query 1: Find all transactions from year 2011 and sort them by value (small to high).

		System.out.println(transactions
				.stream()
				.filter(y->y.getYear()==2011)
				.map(Transaction::getValue)
				.sorted()
				.collect(Collectors.toList()));
        
        // Query 2: What are all the unique cities where the traders work?
		System.out.println(transactions
				.stream()
				.map(t->t.getTrader().getCity())
				.distinct()
				.collect(Collectors.toList()));

        // Query 3: Find all traders from Cambridge and sort them by name.
		System.out.println(transactions
				.stream()
				.filter(c->c.getTrader().getCity().equals("Cambridge"))
				.distinct()
				.map(t->t.getTrader().getName())
				.sorted()
				.collect(Collectors.toList()));
   
        
        // Query 4: Return a string of all traders names sorted alphabetically.
		System.out.println(transactions
				.stream()
				.map(t->t.getTrader().getName())
				.distinct()
				.sorted()
				.reduce("", (n1, n2) -> n1 + " " +n2));

        // Query 5: Are there any trader based in Milan?
		System.out.println(transactions.stream()
				.anyMatch(transaction -> transaction.getTrader().getCity().equals("Milan")));
   
     // Query 6: Update all transactions so that the traders from Milan are set to Cambridge.
		transactions.stream()
				.filter(m->m.getTrader().getCity().equals("Milan"))
				.forEach(t->t.getTrader().setCity("Cambridge"));
		System.out.println(transactions);
        
        // Query 7: What's the highest value in all the transactions?
		
		int highestValue = transactions.stream()
	                        .map(Transaction::getValue)
	                        .reduce(0, Integer::max);
	        System.out.println(highestValue); 
    }
}
