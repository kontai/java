package Java語言程序設計基礎篇.Exercise_25.Exercise_25_02;

public abstract class AbstractTree<E>
		implements Tree<E> {
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