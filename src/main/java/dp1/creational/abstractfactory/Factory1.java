package dp1.creational.abstractfactory;

public class Factory1 implements AbstractFactory {
	
	public Factory1(){
		System.out.println("Factory1 instantiated!");
	}

	public Product createProduct1() {
		return new ProductA();
	}

	public Product createProduct2() {
		return new ProductB();
	}

}
