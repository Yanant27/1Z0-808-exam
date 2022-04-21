package statementsandoperators;

public class TestOperatorPrecendence {

	public static void main(String[] args) {
//		short x = 10;
//		short y = 3;
////		short result = x + y; // DOES NOT COMPILE
//		int result = x + y; // same with short result = (short) x + y;
//		
//		short x1 = 14; // short > int > float
//		float y1 = 13; // x1 * y1 > float
//		double z1 = 30;
//		double result1 = x1 * y1 / z1; // float > double
		
		int x = 3;
		int y = ++x * 5 / x-- + --x + x-- + x--;
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		
//		long l1 = 192301398193810323; // DOES NOT COMPILE, Java interprets as int and value is greater than int
		long l2 = 192301398193810323L; // Java interprets as long because of postfix 'L'
		
		double d = 20.2;
//		int i = d; // DOES NOT COMPILE
		int i = (int) d;

		String str = null;
		if (str != null && str.length() > 10) {
			System.out.println("valid");
		} else {
			System.out.println("invalid");
		}
	}

}
