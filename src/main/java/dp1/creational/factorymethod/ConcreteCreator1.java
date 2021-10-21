package dp1.creational.factorymethod;

public class ConcreteCreator1 extends Creator{
	
	protected Product factoryMethod(){
		return new Product1();
	}
	
}