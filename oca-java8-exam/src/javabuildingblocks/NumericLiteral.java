/*
 * 
 */
package javabuildingblocks;

import javax.sound.midi.Soundbank;

public class NumericLiteral {
	public static void main(String[] args) {
		int million1 = 1000000;
		int million2 = 1_000_000;

//		double notAtStart = _1000.00; // DOES NOT COMPILE
//		double notAtEnd = 1000.00_; // DOES NOT COMPILE
//		double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0; // this one compiles
		float annoyingButLegal2 = 1_00_0.0_0f; // this one compiles

		System.out.println(million1);
		System.out.println(million2);
		System.out.println(annoyingButLegal);
		System.out.println(annoyingButLegal2);
	}

	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {
			onlyOneBranch = 1;
			answer = 1;
		} else {
			answer = 2;
		}
		System.out.println(answer);
//		System.out.println(onlyOneBranch); // DOES NOT COMPILE
	}
}
