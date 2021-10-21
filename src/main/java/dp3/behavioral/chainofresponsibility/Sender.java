package dp3.behavioral.chainofresponsibility;

public class Sender {
	
	private RequestHandler handler;
	
	public Sender(RequestHandler _handler) {
		super();
		this.handler = _handler;
	}

	public void request() {
		handler.handleRequest();
	}

}
