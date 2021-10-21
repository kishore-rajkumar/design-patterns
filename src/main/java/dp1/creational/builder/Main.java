package dp1.creational.builder;

public class Main {

	public static void main(String[] args) {
		Director director = new Director(new Builder1());
		System.out.println(director.construct());
	}

}
