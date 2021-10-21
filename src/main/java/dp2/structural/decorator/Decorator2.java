package dp2.structural.decorator;

public class Decorator2 extends Decorator {

	public Decorator2(Component _component) {
		super(_component);
		System.out.println("Executing Decorator2");
	}
	
	@Override
	public void operation() {
		super.operation();
		this.addBehaviour();
	}

	private void addBehaviour() {
		System.out.println("================ Decorator2: Additional behavioud added ================");	
	}

}
