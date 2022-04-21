package inheritance.multipleinheritance;

public interface Herbivore {
	public void eatPlants();
	
	public default void printInfo() {
		System.out.println("Info");
	}
	
	default String getInfo() {
		return "Info:";
	}
}

class Test implements Herbivore {

	@Override
	public void eatPlants() {
		// TODO Auto-generated method stub
		
	}
	
	public void printInfo() {
		System.out.println("Override");
	}
}
