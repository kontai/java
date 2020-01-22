package Java語言程序設計基礎篇.Exercise_24.Exercise_24_04;

public class GenericStack<E> {
	private java.util.ArrayList<E> list = new java.util.ArrayList<>();

	public int getSize() {
		return list.size();
	}

	public E peek() {
		return list.get(getSize() - 1);
	}

	public void push(E o) {
		list.add(o);
	}

	public E pop() {
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		return o;
	}

	public boolean isEmpty() {
		return list.isEmpty();
	}

	@Override
	public String toString() {
		return "stack: " + list.toString();
	}
}