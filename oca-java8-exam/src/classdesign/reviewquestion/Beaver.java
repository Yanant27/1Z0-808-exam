package classdesign.reviewquestion;

import java.io.IOException;

class Rodent {
	protected Integer chew() throws IOException {
		System.out.println("Rodent is chewing");
		return 1;
	}
}

public class Beaver extends Rodent {
	public Integer chew() throws RuntimeException {
		System.out.println("Beaver is chewing on wood");
		return 2;
	}
	
	public static void main(String[] args) throws IOException {
		Rodent rodent = new Rodent();
		rodent.chew(); // call subclass's method due to polymorphism
	}
}