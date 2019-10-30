package BuilderPatternComponents;

public class ProductBuilder {

	   public Product buildXiaomiSmartphone (){
		   Product products = new Product();
		   products.addItem(new XiaomiPhone());
	      return products;
	   }   
	   public Product buildIphone (){
		   Product products = new Product();
		   products.addItem(new Iphone());
	      return products;
	   }   
	   
	   public Product buildMiNotebook (){
		  Product products = new Product();
		  products.addItem(new MiNotebook());
	      return products;
	   }
	   public Product buildMacBook (){
		  Product products = new Product();
		  products.addItem(new MacBook());
	      return products;
	   }
	}