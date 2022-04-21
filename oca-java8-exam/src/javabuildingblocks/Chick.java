package javabuildingblocks;

public class Chick {
	private String name = "Fluffy";
	{
		System.out.println("setting field");
	}

	public Chick() {
		name = "Tiny";
		System.out.println("setting constructor");
	}

	static {
		System.out.println("static");
	}
	public static void main(String[] args) {
		System.out.println("Main method - 1");
		Chick chick = new Chick();
		System.out.println("Main method - 2");
		System.out.println(chick.name);
	}
}