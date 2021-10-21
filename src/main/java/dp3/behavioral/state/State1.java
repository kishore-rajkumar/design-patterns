package dp3.behavioral.state;

public class State1 implements State {
	
	public static final State INSTANCE = new State1();
	
	private State1() {
		
	}

	public static State getInstance() {
		return INSTANCE;
	}

	public String operation(Context context) {
		String result = " State1 : Hello World1!" +
				" Changing current state of Context to State2.";
		context.setState(State2.getInstance());
		return result;
	}

}
