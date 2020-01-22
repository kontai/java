package Java語言程序設計基礎篇.Exercise_25.Exercise_25_10;

import Java語言程序設計基礎篇.Exercise_25.Exercise_25_01.Tree;

public abstract class AbstractTree<E>
		implements Tree<E>
{
	/** Return true if the element is in the tree */
	public abstract boolean search(E e);

	/** Insert element e into the binary search tree.
	 *	Return true if the element is inserted successfully. */
	public abstract boolean insert(E e);

	@Override /** Inorder traversal from the root */
	public void inorder() {
	}

	@Override /** Postorder traversal from the root */
	public void postorder() {
	}

	@Override /** Preorder traversal from the root */
	public void preorder() {
	}

	@Override /** Return true if the tree is empty */
	public boolean isEmpty() {
		return getSize() == 0;
	}
}