package dp2.structural.bridge;

public class Abstraction1 implements Abstraction {
	private Implementor implementor;

	public Abstraction1(Implementor _implementor) {
		super();
		this.implementor = _implementor;
	}

	public void operation() {
		implementor.implementOperation();
	}

}
