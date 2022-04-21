package classdesign.polymorphism;

public class Dog extends Animal{
	int age = 20;
	public void eat() {
		System.out.println("Dog is eating");
		System.out.println("Dog age " + this.age);
	}
}
