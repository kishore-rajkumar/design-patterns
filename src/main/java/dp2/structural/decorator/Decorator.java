package dp2.structural.decorator;

public abstract class Decorator extends Component {

	private Component component;

	public Decorator(Component _component) {
		super();
		this.component = _component;
	}

	@Override
	public void operation() {
		component.operation();
	}

}
