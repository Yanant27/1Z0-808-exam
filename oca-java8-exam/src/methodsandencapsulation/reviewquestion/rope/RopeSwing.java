package methodsandencapsulation.reviewquestion.rope;

import methodsandencapsulation.reviewquestion.rope.*;
import static methodsandencapsulation.reviewquestion.rope.Rope.*;

public class RopeSwing {
	private static Rope rope1 = new Rope();
	private static Rope rope2 = new Rope();
	// instance initialize will be called only for instantiation
	{
//		rope2.length = 100;
		System.out.println(rope1.length);
		String str = "ss";
	}

	public static void main(String[] args) {
		rope1.length = 2;
		rope2.length = 8;
		new RopeSwing();
		System.out.println(rope1.length);
	}
}