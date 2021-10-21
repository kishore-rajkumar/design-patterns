package dp1.creational.factorymethod;

public class ConcreteCreator2 extends Creator{
	
	protected Product factoryMethod(){
		return new Product2();
	}
	
}