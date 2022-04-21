package methodsandencapsulation.staticimport;

import java.util.List;

import methodsandencapsulation.staticvariables.Counter;

import static java.util.Arrays.asList; // static import

import java.util.Arrays;

public class StaticImports {
	public static void main(String[] args) {
		List<String> list = asList("one", "two"); // with static import
		List<Integer> integers = Arrays.asList(10, 20, 30); // without static import, needs "import java.util.Arrays;"
	}
}