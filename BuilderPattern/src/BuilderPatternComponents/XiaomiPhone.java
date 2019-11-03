package BuilderPatternComponents;


public class XiaomiPhone extends Smartphone {
	   
	@Override
	   public float price() {
	      return 299.99f;
	   }

	   @Override
	   public String name() {
	      return "Xiaomi Mi9t";
	   }
	   public Brand brand() {
		   return Brand.xiaomi;
	   }
	
}
