package dp2.structural.bridge;

public class Client {

	public void clientOperation() {
		Abstraction abstraction= new Abstraction1(new Implementator2());
		abstraction.operation();
	}

}
