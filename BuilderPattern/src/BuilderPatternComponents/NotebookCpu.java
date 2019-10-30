package BuilderPatternComponents;

public class NotebookCpu implements Cpu {


	@Override
	public int cost() {
		return 500;
	}

	@Override
	public String cpuName() {
		return "Notebook Cpu";
	}
}