package BuilderPatternComponents;

import Products.Iphone;
import Products.MacBook;
import Products.MiNotebook;
import Products.XiaomiPhone;

public class Director {

	private static Director instance = new Director();
	private Director() {}

	public Creator buildXiaomiSmartphone (){
		Creator products = new Creator();
		products.addItem(new XiaomiPhone());
		return products;
	}   
	public Creator buildIphone (){
		Creator products = new Creator();
		products.addItem(new Iphone());
		return products;
	}   

	public Creator buildMiNotebook (){
		Creator products = new Creator();
		products.addItem(new MiNotebook());
		return products;
	}
	public Creator buildMacBook (){
		Creator products = new Creator();
		products.addItem(new MacBook());
		return products;
	}
	public static Director getInstance(){
		return instance;
	}
}