package BuilderPatternComponents;

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
	}