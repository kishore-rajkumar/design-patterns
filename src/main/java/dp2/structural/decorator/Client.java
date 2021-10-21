package dp2.structural.decorator;

public class Client {

	public void clientOperation() {
		System.out.println("Executing client operation...");
		System.out.println("1. Component: ");
		Component component = new Component1();

		Component decorator = new Decorator1(new Decorator2(component));
		System.out.println("2. Decorator: ");
		decorator.operation();

	}

}
