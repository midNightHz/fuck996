package fuck996.tree;

import java.util.List;

public class Tree {

	/**
	 * 树的遍历可分为
	 * 
	 * 前序遍历：先访问根节点，再访问左子树，最后访问右子树
	 * 
	 * 中序遍历：先访问左子树，再访问根节点，最后访问右子树
	 * 
	 * 后序遍历：先访问左子树，再访问右子树，最后访问根节点
	 * 
	 * 三种遍历方式可以用递归来实现，可以可以用非递归方式来遍历
	 */

	private transient TreeNode<Object> root;

	public TreeNode<Object> getRoot() {
		return root;
	}

	public void setRoot(TreeNode<Object> root) {
		this.root = root;
	}

	public static void main(String[] args) {
		
		Tree tree = new Tree();
		TreeNode<Object> root = tree.getRoot();
		traversal(root);
	}
	//递归方式的前序遍历
	private static void traversal(TreeNode<Object> node) {

		if (node == null) {
			return;
		}

		List<TreeNode<Object>> childrens = node.getChildrens();

		if (childrens == null) {
			return;
		}
		childrens.forEach(n -> {
			traversal(n);
		});
	}

}
