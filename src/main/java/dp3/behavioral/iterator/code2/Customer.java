package dp3.behavioral.iterator.code2;

public class Customer {

	private String name;
	private long sales;

	public Customer(String _name, long _sales) {
		this.name = _name;
		this.sales = _sales;
	}

	public String getName() {
		return name;
	}

	public long getSales() {
		return sales;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", sales=" + sales + "]";
	}

}
