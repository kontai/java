package 集合框架.IIList集合.p2_LinkedList.test;

import java.util.LinkedList;

public class DuiLie {
	private LinkedList link;

	public DuiLie() {
		link = new LinkedList();
	}

	/**
	 * 隊列的添加元素的功能。
	 */
	public void myAdd(Object obj) {
		link.addLast(obj);
	}

	public Object myGet() {
		return link.removeFirst();
	}

	public boolean isNull() {
		return link.isEmpty();
	}
}
