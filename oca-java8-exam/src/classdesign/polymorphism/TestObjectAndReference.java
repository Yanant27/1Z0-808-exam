package classdesign.polymorphism;

public class TestObjectAndReference {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Animal animal = dog;
		animal.eat();
		
		Kitten kitten = new Kitten();
		animal = kitten;
		animal.eat();
//		animal.meow(); //  DOES NOT COMPILE, method meow() is undefined for the type Animal
		System.out.println("Animal is wild: "+ animal.isWild());
		System.out.println("Kitten is wild: "+ kitten.isWild());
		
		Cat cat = kitten;
//		cat.meow(); //  DOES NOT COMPILE, method meow() is undefined for the type Animal
		cat.eat();
		System.out.println("Cat is wild: "+ cat.isWild());
}

}