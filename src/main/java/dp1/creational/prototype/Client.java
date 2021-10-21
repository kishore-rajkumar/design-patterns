package dp1.creational.prototype;

public class Client {
	
	private Prototype prototype;

	public Client(Prototype _prototype) {
		this.prototype=_prototype;
	}
	
	public String operation() {
		Product product=this.prototype.clone();
		return "Client: Cloning " + prototype.getClass().getSimpleName() +  "; " 
				+ product.getName() + " object copied.";
	}

}
