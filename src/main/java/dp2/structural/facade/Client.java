package dp2.structural.facade;

public class Client {

	public void clientOperation() {
		
		Facade facade= new Facade1(new Class1(),new Class2(),new Class3());
		System.out.println(facade.operation());
		
	}

}
