package dp2.structural.facade;

public class Facade1 extends Facade {

	private Class1 obj1;
	private Class2 obj2;
	private Class3 obj3;

	public Facade1(Class1 _obj1, Class2 _obj2, Class3 _obj3) {
		this.obj1 = _obj1;
		this.obj2 = _obj2;
		this.obj3 = _obj3;
	}

	@Override
	protected String operation() {
		this.doSomeWork();
		return "Forwards request to... " + obj1.operation1() + obj2.operation2() + obj3.operation3();

	}

	private void doSomeWork() {
		System.out.println("Facade does some pre-forwarding work..");
		for(int i=0;i<100;i++) {
			if(i%10==0) {
				System.out.println("\b");
			}
			System.out.print((i+1)+"s ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(" > pre-forwarding work completed...");
		System.out.println("\n");
	}
}
