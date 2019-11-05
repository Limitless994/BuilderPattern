package GenericComponents;

public class SmallDisplay implements Display {

	@Override
	public String display() {
		return "smallDisplay";
	}

	@Override
	public int cost() {
		return 100;
	}
}