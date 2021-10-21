package dp3.behavioral.state;

public class Client {

	public void clientOperation() {
		
		Context context = new Context();
		context.setState(State1.getInstance());
		
		System.out.println("1. " + context.operation());
		
		System.out.println("2. " + context.operation());
		
	}

}
