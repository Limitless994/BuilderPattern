package BuilderPatternComponents;

public class Iphone extends Smartphone {

	@Override
	public float price() {
		return 1099.99f;
	}

	@Override
	public String name() {
		return "Iphone 11 pro";
	}
	   public Brand brand() {
		   return Brand.apple;
	   }
	
}
