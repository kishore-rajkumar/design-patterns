package dp1.creational.builder;

import java.util.ArrayList;
import java.util.List;

public class ComplexObject {

	List<Product> products = new ArrayList<Product>();

	public boolean add(Product product) {
		return products.add(product);

	}

	public String getParts() {
		String str = "Complex Objetct made up of";

		for (Product p : products) {
			str +=" "+ p.getClass();
		}
		return str;
	}

}
