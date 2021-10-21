package dp3.behavioral.chainofresponsibility;

public class Receiver2 extends RequestHandler {

	public Receiver2(RequestHandler _successor) {
		super(_successor);
	}

	public void handleRequest() {
		if(canHandleRequest()) {
			System.out.println("Receiver2: handling the request...");
		}else {
			System.out.println("Receiver2: passing request along the chain...");
			super.handleRequest();
		}
	}

	

}
