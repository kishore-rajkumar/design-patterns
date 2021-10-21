package dp3.behavioral.chainofresponsibility;

public abstract class RequestHandler {

	private RequestHandler successor;
	
	public RequestHandler() {
		
	}

	public RequestHandler(RequestHandler _successor) {
		super();
		this.successor = _successor;
	}

	public void handleRequest() {
		if (successor != null) {
			successor.handleRequest();
		}
	}

	public boolean canHandleRequest() {
		return false;
	}

}
