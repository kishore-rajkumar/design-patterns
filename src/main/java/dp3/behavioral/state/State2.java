package dp3.behavioral.state;

public class State2 implements State {

	public static final State INSTANCE = new State2();

	private State2() {

	}

	public String operation(Context context) {
		String result = " State2 : Hello World2!" +
				" Changing current state of Context to State1.";
		context.setState(State1.getInstance());
		return result;
	}

	public static State getInstance() {
		return INSTANCE;
	}

}
