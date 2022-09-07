import java.util.*;
class DoublyLinkedList<T> implements Iterable<T> {
	private static class Node<T> {
		Node<T> _next, _prev;
		T _data;
	}
	private Node<T> _head = new Node<T>(), _tail = new Node<T>();
	private int _numElements = 0;

	public DoublyLinkedList () {
		_head._next = _tail;
		_tail._prev = _head;
	}

	// Returns the number of elements in the list
	public int size () {
		return _numElements;
	}

	// Adds an element to the tail of the list
	public void add (T elem) {
		Node<T> node = new Node<T>();
		node._data = elem;
		node._prev = _tail._prev;
		node._next = _tail;
		_tail._prev._next = node;
		_tail._prev = node;
		_numElements++;
	}

	// Returns the element at the specified index
	public T get (int index) {
		if (index >= _numElements || index < 0) {
			throw new IllegalArgumentException("Invalid index!");
		}
		Node<T> cursor = _head._next;
		for (int i = 0; i < index; i++) {
			cursor = cursor._next;
		}
		return cursor._data;
	}

	public Iterator<T> iterator () {
		// TODO: implement me
		return new DoublyLinkedListIterator(); // !!! is this all? yes, it should be
	}

	private class DoublyLinkedListIterator implements Iterator<T> {
		// TODO: add any instance variables/methods you want
		// note: can access any outer class instance vars
		// pointer starts at the beginning
		Node<T> pointer = _head._next;
		
		public T next () {
			// TODO: implement me
			// strategy:
			// - uses a pointer that stores an instance of the node that will be returned when next() is called

			Node<T> temp = pointer;
			pointer = pointer._next;
			return temp._data;
		}

		public boolean hasNext () {
			// TODO: implement me
			// strategy:
			// - if the pointer is not the tail
			return !pointer.equals(_tail);
		}
		public void remove () {
			// TODO: implement me
			// strategy:
			// - splice pointer._prev from the list
			// - pointer should stay the same, except for its reference to prev

			pointer._prev._prev._next = pointer;
			pointer._prev = pointer._prev._prev;
		}
	}

	public static void main (String[] args) {
		DoublyLinkedList<String> list = new DoublyLinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");

		for (String str : list) {
			System.out.println(str);
		}
	}
}
