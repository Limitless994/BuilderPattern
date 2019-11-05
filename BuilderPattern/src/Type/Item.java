package Type;

import GenericComponents.Brand;
import GenericComponents.Cpu;
import GenericComponents.Display;

public interface Item {
	public String name();
	public Display display();
	public Cpu cpu();
	public float price();
	public ProductType type();
	public Brand brand();
}