package Products;

import GenericComponents.BigDisplay;
import GenericComponents.Cpu;
import GenericComponents.Display;
import GenericComponents.NotebookCpu;
import Type.Item;
import Type.ProductType;

public abstract class Notebook implements Item {

	   @Override
	   public Display display() {
	      return new BigDisplay();
	   }

	   @Override
	   public abstract float price();
	   
	   public Cpu cpu() {
		return new NotebookCpu();
		   
	   }
	   public ProductType type() {
		   return ProductType.notebook;
	   }
	}