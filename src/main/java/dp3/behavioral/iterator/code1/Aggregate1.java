package dp3.behavioral.iterator.code1;

import java.util.Iterator;

public class Aggregate1<T> implements Aggregate<T> {

	private Object[] elements;
	private int index;
	private int size;

	public Aggregate1(int _size) {
		this.size = _size;
		this.elements = new Object[size];
	}

	public boolean add(String element) {
		if (index < size) {
			elements[index++] = element;
			return true;
		}
		return false;
	}

	public Iterator<T> createIterator() {
		return new Iterator1<T>();
	}

	// iterator inner implementation class
	private class Iterator1<T> implements Iterator<T> {

		private int cursor;

		public boolean hasNext() {
			return cursor < size;
		}

		public T next() {
			return (T) elements[cursor++];
		}

	}

}
