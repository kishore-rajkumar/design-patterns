package dp1.creational.factorymethod;

public abstract class Creator{

	public void operation(){
		/* Product p= new Product1(); // problem here; what if Product2 instance is needed;
										Code change will be required 
		*/
		Product p = factoryMethod();
		p.doSomething();
	}
	
	protected abstract Product factoryMethod();
	
}