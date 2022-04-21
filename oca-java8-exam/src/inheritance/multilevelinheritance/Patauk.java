package inheritance.multilevelinheritance;

public class Patauk implements TreeWithStem {
	public static void main(String[] args) {

	}

	@Override
	public boolean isTall() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isGoodForFurniture() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasLeaves() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasBranches(int height) {
		return true;
	}
	
//	public String hasBranches() { // DOES NOT COMPILE
//		return "true";
//	}
	
}
