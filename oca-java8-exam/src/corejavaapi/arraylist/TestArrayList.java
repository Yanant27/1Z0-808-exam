package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		ArrayList list2 = new ArrayList(10);
		ArrayList list3 = new ArrayList(list2);
		System.out.println(list1.size()); // 0
		System.out.println(list2.size()); // 0
		System.out.println(list3.size()); // 0

		List<String> birds = new ArrayList<>();
		birds.add("hawk"); // [hawk]
		birds.add(1, "robin"); // [hawk, robin]
		birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
		System.out.println(birds); // [blue jay, cardinal, hawk, robin]
		
		System.out.println("----------------------");
		System.out.println(birds.remove(0)); // blue jay
//		System.out.println(birds.remove(10)); // IndexOutOfBoundsException
		System.out.println(birds); // [cardinal, hawk, robin]
		System.out.println(birds.remove("robin")); // true
		System.out.println(birds.remove("eagle")); // false
		System.out.println(birds);
		System.out.println("----------------------");
		
		System.out.println(birds.set(0, "eagle"));
		System.out.println(birds);
//		System.out.println(birds.set(10, "sparrow")); // IndexOutOfBoundsException
		
		System.out.println("----------------------");
		System.out.println(birds.size()); // 2
		System.out.println(birds.isEmpty()); // false
		
		System.out.println("----------------------");
		birds.clear();
		System.out.println(birds.size()); // 0
		System.out.println(birds.isEmpty()); // true
		
		System.out.println("-----------Test equals()----------");
//		List<String> first = Arrays.asList(new String[]{"10", "20", "30"});
		List<String> first = Arrays.asList("10", "20", "30"); // same with above
		List<String> second = new ArrayList<>();
		System.out.println(first.equals(second));
		second.add("10");
		second.add("30");
		second.add("20");
		System.out.println(second);
		System.out.println(first.equals(second));
		second.set(1, "20");
		System.out.println(second);
		second.set(2, "30");
		System.out.println(second);
		System.out.println(first.equals(second));
		
//		System.out.println(first.remove(0)); // 	
//		first.add(100, "test");// UnsupportedOperationException
//		System.out.println(first.set(100, "test")); // ArrayIndexOutOfBoundsException
		System.out.println("-----------Test Wrapper----------");
		List<Integer> numbers = new ArrayList<>();		
		numbers.add(1);		
		numbers.add(2);		
		numbers.add(3);
		numbers.remove(1); // remove element from index=1, doesn't use wrapper class		
		System.out.println(numbers); // [1, 3]		
		numbers.remove(new Integer(3)); // force wrapper class use.		
		System.out.println(numbers); // [1]
		
		List<Integer> ages = new ArrayList<>();
		ages.add(null);
		for (int age : ages) System.out.print(age);
	}

}
