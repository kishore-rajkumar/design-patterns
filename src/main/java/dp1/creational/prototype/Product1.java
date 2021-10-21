package dp1.creational.prototype;

public class Product1 implements Product, Prototype{
	
	private String name;

	public Product1(String _name) {
		this.name=_name;
	}

	public Product1(Product1 product1) {
		this.name=product1.getName();
	}

	public String getName() {
		return this.name;
	}
	
	@Override
	public Product clone() {
		return new Product1(this);
	}
	

}
