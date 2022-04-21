package classdesign.classcast;

class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

public class Lemur extends Primate implements HasTail {
	public boolean isTailStriped() {
		return false;
	}

	public int age = 10;

	public static void main(String[] args) {
		Lemur lemur = new Lemur();
		System.out.println(lemur.age);
		
		HasTail hasTail = lemur; // implicit type cast
		System.out.println(hasTail.isTailStriped());
		
		Primate primate = lemur; // implicit type cast
		System.out.println(primate.hasHair()); // only access to parent's methods
		
		if (primate instanceof Lemur) {
			System.out.println("instance of Lemur");
		} else {
			System.out.println("not an instance of Lemur");
		}
		
		if (primate instanceof Primate) {
			System.out.println("instance of Primate");
		} else {
			System.out.println("not an instance of Primate");
		}
		
		if (primate instanceof HasTail) {
			System.out.println("instance of HasTail");
		} else {
			System.out.println("not an instance of HasTail");
		}
		
		System.out.println("------------------------------");
		// COMPILE because "primate" is implicitly type cast from Lemur to Primate in line 27
		lemur = (Lemur) primate; 
		lemur.isTailStriped();
		lemur.hasHair();
		
		Primate p = new Primate();
		lemur = (Lemur) p; // ClassCastException, parent = Primate, child = Lemur
		
		
	}
}
