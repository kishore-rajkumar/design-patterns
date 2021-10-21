package dp2.structural.adapter;

public class ObjectAdapter implements Target {
	
	private Adaptee adaptee;
	
	public ObjectAdapter(Adaptee _adaptee) {
		this.adaptee=_adaptee;
	}

	public String operation() {
		return adaptee.specificOperation();
	}

}
