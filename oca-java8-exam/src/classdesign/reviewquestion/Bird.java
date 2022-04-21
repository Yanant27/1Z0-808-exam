package classdesign.reviewquestion;

public class Bird {
	/*
	 * if access modifier is "private", print "Bird is flying"
	 * if access modifier is "protected/ package-private", print "Pelican is flying"
	 */
	private void fly() {
		System.out.println("Bird is flying");
	}

	public static void main(String[] args) {
		Bird bird = new Pelican();
		bird.fly();
	}
	
}

class Pelican extends Bird {
	protected void fly() {
		System.out.println("Pelican is flying");
	}
	
//	public static void main(String[] args) {
//		Bird bird = new Pelican();
//		bird.fly(); //  fly() from the type Bird is not visible
//	}
}