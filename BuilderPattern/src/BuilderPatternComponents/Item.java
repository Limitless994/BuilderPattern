package BuilderPatternComponents;

public interface Item {
	public String name();
	public Display display();
	public Cpu cpu();
	public float price();
	public ProductType type();
	public Brand brand();
}