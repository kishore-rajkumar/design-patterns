package dp1.creational.builder;

public class Builder1 implements Builder {
	
	private ComplexObject co = new ComplexObject();

	public void buildPartA() {
		System.out.println("BUILDER 1: building part A");
		co.add(new ProductA1());
	}

	public void buildPartB() {
		System.out.println("BUILDER 1: building part B");
		co.add(new ProductB1());
	}

	public ComplexObject getResult() {
		return co;
	}

}
