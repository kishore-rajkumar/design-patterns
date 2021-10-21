package dp3.behavioral.strategy;

public class Client {

	public void clientOperation() {
		
		Context context= new Context();
		context.setStrategy(new Strategy1());
		context.operation();
		
		System.out.println();
		System.out.println("Client changes strategy....");
		System.out.println();
		
		context.setStrategy(new Strategy2());
		context.operation();
		
	}

}
