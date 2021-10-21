package dp1.creational.prototype;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client(new Product1("Product1"));
		String name = client.operation();
		System.out.println("["+Main.class.getCanonicalName()+"] -> "+ name);
	}

}
