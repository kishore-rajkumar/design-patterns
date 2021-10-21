package dp3.behavioral.observer;

public class Subject1 extends Subject {

	private int state;

	@Override
	public void setState(int _state) {
		System.out
				.println("Subject1: state changed from " + this.state + " to " + _state + "; Notifying observers ...");
		this.state = _state;
		super.notifyObservers();
	}


	@Override
	public int getState() {
		return this.state;
	}

}
