package dp1.creational.abstractfactory;

public class Client {
	
	private AbstractFactory factory;

	public Client(AbstractFactory _factory) {
		this.factory = _factory;
	}

	public void operation() {
		
		Product product1=factory.createProduct1();
		Product product2=factory.createProduct2();
		
		product1.doSomething();
		product2.doSomething();
		
	}

}
