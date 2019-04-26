package fuck996.tree;

import java.util.List;

public class Tree {

	/**
	 * ���ı����ɷ�Ϊ
	 * 
	 * ǰ��������ȷ��ʸ��ڵ㣬�ٷ�����������������������
	 * 
	 * ����������ȷ������������ٷ��ʸ��ڵ㣬������������
	 * 
	 * ����������ȷ������������ٷ����������������ʸ��ڵ�
	 * 
	 * ���ֱ�����ʽ�����õݹ���ʵ�֣����Կ����÷ǵݹ鷽ʽ������
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
	//�ݹ鷽ʽ��ǰ�����
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
