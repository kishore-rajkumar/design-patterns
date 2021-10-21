package dp3.behavioral.observer;

public class Client {

	public void clientOperation() {

		// better if abstract interface is referred
		Subject subject = new Subject1();

		Observer o1 = new Observer1(subject);
		Observer o2 = new Observer2(subject);

		System.out.println("Changing state of Subject1 ...");
		subject.setState(100);

		System.out.println();
		subject.detatch(o2);

	}

}
