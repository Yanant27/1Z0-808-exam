package corejavaapi.stringbuilder;

public class TestStringBuilder {

	public static void main(String[] args) {
//		StringBuilder a = new StringBuilder("abc");
//		StringBuilder b = a.append("de");
//		b = b.append("f").append("g");
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		
//		System.out.println("----------------------");
//		
//		StringBuilder sb = new StringBuilder("animals");	
//		String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al")); // anim	
//		int len = sb.length(); // 7	
//		char ch = sb.charAt(6); // s	
//		System.out.println(sub + " " + len + " " + ch);

//		int total = 0;
//		StringBuilder letters = new StringBuilder("abcdefg");
//		total += letters.substring(1, 2).length();
//		total += letters.substring(6, 6).length();
//		total += letters.substring(6, 5).length();
//		System.out.println(total);

		String a = "";
		a += 2;
		a += 'c';
		a += false;
		if (a == "2cfalse")
			System.out.println("==");
		if (a.equals("2cfalse"))
			System.out.println("equals");
	}
}
