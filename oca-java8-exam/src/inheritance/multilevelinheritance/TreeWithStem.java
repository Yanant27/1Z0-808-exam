package inheritance.multilevelinheritance;

public interface TreeWithStem extends Tree{
	boolean isGoodForFurniture();
	boolean hasLeaves();
	default boolean hasBranches() {
		return false;
	}
}
