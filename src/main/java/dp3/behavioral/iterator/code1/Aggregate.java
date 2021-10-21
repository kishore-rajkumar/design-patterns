package dp3.behavioral.iterator.code1;

import java.util.Iterator;

public interface Aggregate<T> {

	boolean add(String string);

	Iterator<T> createIterator();

}
