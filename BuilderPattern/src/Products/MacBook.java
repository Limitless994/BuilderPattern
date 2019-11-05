package Products;

import GenericComponents.Brand;

public class MacBook extends Notebook {

	   @Override
	   public float price() {
	      return 1399.99f;
	   }

	   @Override
	   public String name() {
	      return "MacBook pro ";
	   }
	   public Brand brand() {
		   return Brand.apple;
	   }
	
}