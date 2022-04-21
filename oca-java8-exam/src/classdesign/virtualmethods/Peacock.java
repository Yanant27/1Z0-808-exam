package classdesign.virtualmethods;

class Bird {
	int age = 5;
	public String getName() {
		return "Unknown";
	}

	public void displayInformation() {
		// decide at runtime which method to be called
		System.out.println("The bird name is: " + getName() + ", age is " + age); 
	}
}

public class Peacock extends Bird {
	int age = 10;
	public String getName() {
		return "Peacock";
	}

	public static void main(String[] args) {
		Bird bird = new Peacock();
		bird.displayInformation();
	}
}