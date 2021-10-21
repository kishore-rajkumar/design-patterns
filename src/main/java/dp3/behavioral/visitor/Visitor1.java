package dp3.behavioral.visitor;

public class Visitor1 extends Visitor {

	@Override
	void visitElemtentA(Element element) {
		System.out.println("Visitor -> Visitor1: Addtional behaviour...");
		element.operation();
	}

	@Override
	void visitElemtentB(Element element) {
		element.operation();
		System.out.println("Visitor -> Visitor1: Addtional behaviour...");
	}


}
