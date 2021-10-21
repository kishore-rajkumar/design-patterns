package dp1.creational.singleton;

public class Singleton {
	
	private static final Singleton INSTANCE = new Singleton();

	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return INSTANCE;
	}
	
	public void doSomething() {
		System.out.println(getInstance()+": Some singleton operation");
	}

}
