package classdesign.polymorphism;

public class Animal {
	int age = 5;
	public void eat() {
		System.out.println("Animal is eating....");
	}

	public boolean isWild() {
		eat();
		return true;
	}
	
	public String getName() {
		return "Animal";
		}
}
