package corejavaapi.array;

import java.util.Arrays;

public class ArrayType {
	public static void main(String args[]) {
		String[] bugs = { "cricket", "beetle", "ladybug" };
		String[] alias = bugs;
		System.out.println(bugs.equals(alias)); // true
		System.out.println(bugs.toString()); // [Ljava.lang.String;@160bc7c0
		System.out.println(Arrays.toString(bugs)); // [cricket, beetle, ladybug]
	}
}