package exceptions;

public class NestedExceptions {

	public static void main(String[] args) {
		System.out.println(exceptions());
	}

	private static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before ";
				v.length();
				result += "after ";
			} catch (NullPointerException e) {
				result += "catch ";
				throw new RuntimeException();
			} finally {
				result += "finally ";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}
	
	public void bad() throws Exception {
		eatCarrot();
	}

	public void good() throws Exception {
		eatCarrot();
	}

	private static void eatCarrot() throws NoMoreCarrotsException {
	}

	class NoMoreCarrotsException extends Exception {}
}
