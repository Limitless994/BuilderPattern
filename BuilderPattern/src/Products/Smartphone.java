package Products;

import GenericComponents.Cpu;
import GenericComponents.Display;
import GenericComponents.SmallDisplay;
import GenericComponents.SmartphoneCpu;
import Type.Item;
import Type.ProductType;

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
	   public ProductType type() {
		   return ProductType.smartphone;
	   }
	   
}