package statementsandoperators;

public class SwitchSample {
	public static void main(String[] args) {
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

//		final char a = 'A', d = 'D';
//		char grade = 'B';
//		switch (grade) {
//		case a:
//		case 'B':
//			System.out.print("great");
//		case 'C':
//			System.out.print("good");
//		case d:
//		case 'F':
//			System.out.print("not good");
//		}
	}

}