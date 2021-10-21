package dp3.behavioral.chainofresponsibility;

public class Receiver1 extends RequestHandler {

	public Receiver1(RequestHandler _successor) {
		super(_successor);
	}

	public void handleRequest() {
		if(canHandleRequest()) {
			System.out.println("Receiver1: handling the request...");
		}else {
			System.out.println("Receiver1: passing request along the chain...");
			super.handleRequest();
		}
	}

	

}
