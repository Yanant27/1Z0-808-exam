package predicate;

import java.util.function.Predicate;

public class TestPredicate {

	public static void main(String[] args) {
//		Predicate<Integer> p1 = age -> age>20;
		// same with above statement
		Predicate<Integer> p1 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer i) {
				return i<20;
			}
			
		};
		Predicate<Integer> p2 = age -> age<30;
		
		System.out.println(p1.test(19)); // false
		System.out.println(p1.negate().test(19));// true
		System.out.println(p1.and(p2).test(19)); // false && true -> false
		System.out.println(p1.or(p2).test(19)); // false || true -> true
		
		
		// predicate in method parameter
		predInFunction(40,num -> num > 30); // Over limit
		predInFunction(20,num -> num > 30); // Under limit
		
	}
	
	static void predInFunction(int num, Predicate<Integer> pred ) {
		if (pred.test(num)) {
			System.out.println("Over limit");
		} else {
			System.out.println("Under limit");
		}
	}
}

