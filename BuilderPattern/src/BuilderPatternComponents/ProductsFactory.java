package BuilderPatternComponents;

import GenericComponents.Brand;
import Type.ProductType;

public class ProductsFactory {
	Director pb = Director.getInstance();

	public Creator getProduct(ProductType type,Brand brand){
		if(type == null){
			return null;
		}		
		if(type==ProductType.smartphone){
			if(brand==Brand.apple)
				return pb.buildIphone();
			else if(brand==Brand.xiaomi)
				return pb.buildXiaomiSmartphone();

		} else if(type==ProductType.notebook){
			if(brand==Brand.apple)
				return pb.buildMacBook();
			else if(brand==Brand.xiaomi)
				return pb.buildMiNotebook();
		}

		return null;
	}
}