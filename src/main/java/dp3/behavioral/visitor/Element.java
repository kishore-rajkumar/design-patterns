package dp3.behavioral.visitor;

public abstract class Element {
	abstract void accept(Visitor visitor);
	abstract void operation();
}
