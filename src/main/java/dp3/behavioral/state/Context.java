package dp3.behavioral.state;

public class Context {

	private State state;

	public void setState(State _state) {
		this.state = _state;
	}

	public String operation() {
		return "Context: Delegating state-specific behavior to the current State object.\n"+ state.operation(this);
		
	}

}
