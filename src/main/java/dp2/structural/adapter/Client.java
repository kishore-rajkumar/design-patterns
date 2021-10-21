package dp2.structural.adapter;

public class Client {
	
	public void clientOperation() {
		
		Target objectAdapter= new ObjectAdapter(new Adaptee1());
		System.out.println("(1) Object Adapter: " + objectAdapter.operation()); 
	}

}
