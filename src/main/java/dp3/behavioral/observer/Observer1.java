package dp3.behavioral.observer;

public class Observer1 extends Observer {
	
	private Subject subject;

	public Observer1(Subject _subject) {
		this.subject=_subject;
		
		//register self to the subject
		this.subject.attach(this);
	}

	@Override
	void update() {
		// cannot get state since abstract subject does not provide interface; child subject1 implemented this
		System.out.println("Observer1: change detected! new state = "+this.subject.getState());

	}

}
