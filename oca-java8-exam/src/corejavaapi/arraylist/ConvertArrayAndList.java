package corejavaapi.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayAndList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		System.out.println(objectArray.length); // 2
		String[] stringArray = list.toArray(new String[0]);
		System.out.println(stringArray.length); // 2

		String[] array = { "hawk", "robin" }; // [hawk, robin]
		List<String> list2 = Arrays.asList(array); // returns fixed size list
		System.out.println(list2.size()); // 2
		list2.set(1, "test"); // [hawk, test], update both array and list !!!
		for(String str : array) {
			System.out.println(str);
		}
		System.out.println(list2);
		array[0] = "new"; // [new, test]
		for (String b : array)
			System.out.print(b + " "); // new test
//		list2.remove(1); // throws UnsupportedOperation Exception
	}

}
