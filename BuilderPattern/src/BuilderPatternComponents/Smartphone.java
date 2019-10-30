package BuilderPatternComponents;

public abstract class Smartphone implements Item {

	   @Override
	   public Display display() {
	      return new SmallDisplay();
	   }

	   @Override
	   public abstract float price();

	   public Cpu cpu() {
		return new SmartphoneCpu();
		   
	   }
	   
}