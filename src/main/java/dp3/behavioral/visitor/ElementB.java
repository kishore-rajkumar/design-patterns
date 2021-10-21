package dp3.behavioral.visitor;

public class ElementB extends Element {

	@Override
	void accept(Visitor visitor) {
		visitor.visitElemtentB(this);
		

	}

	@Override
	void operation() {
		System.out.println("ElementB: operation executed!");
	}

}
