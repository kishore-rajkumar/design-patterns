package dp3.behavioral.iterator.code1;

import java.util.Iterator;

public class Client {

	public void clientOperation() {

		Aggregate<String> aggregate = new Aggregate1<String>(3);
		aggregate.add("Element 1");
		aggregate.add("Element 2");
		aggregate.add("Element 3");

		Iterator<String> iterator = aggregate.createIterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
