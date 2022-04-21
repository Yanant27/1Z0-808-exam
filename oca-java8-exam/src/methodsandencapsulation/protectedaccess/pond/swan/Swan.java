package methodsandencapsulation.protectedaccess.pond.swan;

import methodsandencapsulation.protectedaccess.pond.shore.Bird;

public class Swan extends Bird { // but subclass of bird		
	public void swim() {	
		floatInWater(); // package access to superclass
		System.out.println(text); // package access to superclass
	}	
		
	public void helpOtherSwanSwim() {	
		Swan other = new Swan();
		other.floatInWater(); // package access to superclass
		System.out.println(other.text);// package access to superclass
	}	
		
	public void helpOtherBirdSwim() {	
		Bird other = new Bird(); // Bird is not a subclass of Bird
//		other.floatInWater(); // DOES NOT COMPILE
//		System.out.println(other.text); // DOES NOT COMPILE
	}	
	
//	public static void main(String[] args) {
//		new Swan().helpOtherSwanSwim();
//	}
}		
