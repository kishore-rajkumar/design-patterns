package dp1.creational.abstractfactory;

public class Factory2 implements AbstractFactory {
	
	public Factory2(){
		System.out.println("Factory2 instantiated!");
	}

	public Product createProduct1() {
		return new ProductC();
	}

	public Product createProduct2() {
		return new ProductD();
	}

}
