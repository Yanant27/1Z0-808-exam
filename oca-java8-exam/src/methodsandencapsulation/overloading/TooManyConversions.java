package methodsandencapsulation.overloading;

public class TooManyConversions {
	public static void play(Long l) {
		System.out.println("Long");
	}

	public static void play(Long... l) {
		System.out.println("Long..");
	}

	public static void main(String[] args) {
//		play(4); // DOES NOT COMPILE, int 4 > long 4 > Long 4, it can't convert in 2 steps
		play(4L); // calls the Long version
	}
}