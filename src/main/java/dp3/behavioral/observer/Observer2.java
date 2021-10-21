package dp3.behavioral.observer;

public class Observer2 extends Observer {

	private Subject subject;

	public Observer2(Subject _subject) {
		this.subject = _subject;

		// register self to the subject
		this.subject.attach(this);
	}

	@Override
	void update() {
		System.out.println("Observer2: change detected! new state = " + this.subject.getState());
	}

}
