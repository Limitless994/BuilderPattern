package BuilderPatternComponents;

public class SmartphoneCpu implements Cpu {


	@Override
	public int cost() {
		return 300;
	}

	@Override
	public String cpuName() {
		return "Smartphone Cpu";
	}
}