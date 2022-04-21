package methodsandencapsulation.staticvariables;

public class CounterTest {

	static int limit = 10;
	int overlimit = 200;
	
	public static void main(String[] args) {
		CounterTest t = new CounterTest();
		t.counting();
		
		System.out.println(t.overlimit); // call instance variable, require reference
		t.counting(); // call instance method, require reference
		System.out.println(limit); // call static variable
		testStatic(); // call static method
//		static int result = overlimit / limit; // DOES NOT COMPILE
//		int result = overlimit / limit; // DOES NOT COMPILE
	}

	private void counting() {
		Counter c1 = new Counter();
		c1.count++; // 1
		Counter c2 = new Counter();
		c2.count++; // 2
		c1 = null;
		c1.count++; // 3
		System.out.println("Count : " + c1.count); // 3
		System.out.println("Count : " + c2.count); // 3
	}

	private void print() {
		System.out.println(limit); // call static variable
		System.out.println(overlimit); // call instance variable
		test(); // call instance method
		testStatic(); // call static method
	}
	
	private void test() {
		System.out.println("Test method");
	}
	
	private static void testStatic() {
		System.out.println("Test static method");
	}
}
