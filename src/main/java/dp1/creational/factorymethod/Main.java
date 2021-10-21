package dp1.creational.factorymethod;

public class Main {

	public static void main(String[] args) {
		Creator c1 = new ConcreteCreator1();
		c1.operation();
		
		// ---------------------------------
		
		Creator c2 = new ConcreteCreator2();
		c2.operation();
	}

}
