package dp1.creational.singleton;

public class Main {

	public static void main(String[] args) {
		Singleton so = Singleton.getInstance();
		Singleton so1 = Singleton.getInstance();

		System.out.println(so == so1);
		System.out.println(so.equals(so1));
		so.doSomething();
		so1.doSomething();

	}

}
