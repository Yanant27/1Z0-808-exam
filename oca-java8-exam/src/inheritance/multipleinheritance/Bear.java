package inheritance.multipleinheritance;

public class Bear implements Herbivore {
	public void eatMeat() {
		System.out.println("Eating meat");
	}

	public void eatPlants() {
		System.out.println("Eating plants");
	}
	
	public static void main(String[] args) {
		new Bear().eatPlants();
	}
}
