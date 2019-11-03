package BuilderPatternComponents;

public class ProductsFactory {
	ProductBuilder pb = ProductBuilder.getInstance();

	public Product getProduct(ProductType type,Brand brand){
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