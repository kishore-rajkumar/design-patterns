package dp2.structural.decorator;

public class Decorator1 extends Decorator {

	public Decorator1(Component _component) {
		super(_component);
		System.out.println("Executing Decorator1");
	}

	@Override
	public void operation() {
		super.operation();
		this.addBehavior();
	}

	private void addBehavior() {
		System.out.println("**************** Decorator1: Additional behavioud added ****************");
	}
}
