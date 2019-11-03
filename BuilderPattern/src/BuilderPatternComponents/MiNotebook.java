package BuilderPatternComponents;

public class MiNotebook extends Notebook {

	   @Override
	   public float price() {
	      return 1099.99f;
	   }

	   @Override
	   public String name() {
	      return "MiNotebook pro ";
	   }
	   public Brand brand() {
		   return Brand.xiaomi;
	   }
	
	}