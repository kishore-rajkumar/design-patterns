package dp3.behavioral.visitor;

public class ElementA extends Element {

	@Override
	void accept(Visitor visitor) {
		visitor.visitElemtentA(this);
	}

	@Override
	void operation() {
		System.out.println("ElementA: operation executed!");
	}

}
