package dp2.structural.decorator;

public class Component1 extends Component {
	
	public Component1() {
		System.out.println("Executing Component1");
		
	}

	@Override
	public void operation() {
		System.out.println("Hello World from Component1");
	}

}
