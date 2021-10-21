package dp3.behavioral.strategy;

public class Context {
	
	private Strategy strategy;

	public void setStrategy(Strategy _strategy) {
		this.strategy = _strategy;

	}

	public void operation() {
		int output = strategy.algorithm();
		System.out.println("Context: algorithm returns: " + output);
	}

}
