package fuck996.collection.stack;

public class Stack<T> implements MyStack<T> {

	private int size;

	private Node<T> first;

	@Override
	public boolean empty() {
		return size == 0;
	}

	@Override
	public T peek() {
		if (first == null) {
			return null;
		}
		return first.t;
	}

	@Override
	public T pop() {
		if (first == null) {
			return null;
		}
		T t = first.t;
		Node<T> next = first.getNext();
		first.setNext(null);
		first = next;
		size--;
		return t;
	}

	@Override
	public T push(T t) {
		Node<T> node = new Node<>(t);
		node.setNext(first);
		first = node;
		size++;
		return t;
	}

	class Node<T> {

		T t;

		Node<T> next;

		public Node(T t) {
			this.t = t;
		}

		public Node<T> getNext() {
			return next;
		}

		public void setNext(Node<T> next) {
			this.next = next;
		}
	}
}
