package dp3.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	List<Observer> observers = new ArrayList<Observer>();

	// register observers
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	// de-register observers
	public void detatch(Observer observer) {
		observers.remove(observer);
		System.out.println("Detach request received for: " + observer.getClass() +"; DETACHED!");
	}

	// notify all registered observers
	public void notifyObservers() {
		for (Observer o : observers) {
			o.update();
		}
	}
	
	public abstract void setState(int i);

	public abstract int getState();


}
