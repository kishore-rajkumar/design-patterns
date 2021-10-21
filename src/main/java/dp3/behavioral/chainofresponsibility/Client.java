package dp3.behavioral.chainofresponsibility;

public class Client {

	public void clientOperation() {
		
		Sender sender = null;
		
		RequestHandler handler = new Receiver1(new Receiver2(new Receiver3()));
		
		sender = new Sender(handler);
		sender.request();
		
	}

}
