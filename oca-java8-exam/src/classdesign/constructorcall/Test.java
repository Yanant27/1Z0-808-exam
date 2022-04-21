package classdesign.constructorcall;

public class Test {

	public static void main(String[] args) {
		new Child();
		
		Mouse mouse = new Mouse();
		mouse.getRodentDetails();
		mouse.getMouseDetails();
	}
}

class Rodent {
	protected int tailLength = 4;

	public void getRodentDetails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}

class Mouse extends Rodent {
	public int tailLength = 8;

	public void getMouseDetails() {
		System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
	}
}