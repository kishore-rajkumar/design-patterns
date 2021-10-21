package dp3.behavioral.iterator.code2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Client {

	public void clientOperation() {
		// set up collection
		int size = 50;
		List<Customer> customers = new ArrayList<Customer>();
		for (int i = 0; i < size; i++) {
			customers.add(new Customer("Customer" + i, 100));
		}

		Iterator<Customer> iterator = customers.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("PREVIOUS=================================================");
		// list previous
		ListIterator<Customer> listIterator = customers.listIterator(size / 2);
		while (listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		System.out.println("=================================================");
		Customer cust39=customers.get(39);
		System.out.println("39th customer is "+cust39);
		
		System.out.println("Index of 39th customer is "+customers.indexOf(cust39));
	}

}
