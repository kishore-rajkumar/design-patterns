package dp3.behavioral.visitor;

public class Client {

	public void clientOperation() {	
		
		Visitor visitor = new Visitor1();
		
		Element elementA = new ElementA();
		elementA.accept(visitor);
		
		Element elementB = new ElementB();
		elementB.accept(visitor);
		
	}

}
