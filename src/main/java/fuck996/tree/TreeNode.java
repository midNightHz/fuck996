package fuck996.tree;

import java.util.List;

public class TreeNode<T> {

	T value;
	
	List<TreeNode<T>> childrens;
	
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public List<TreeNode<T>> getChildrens() {
		return childrens;
	}
	public void setChildrens(List<TreeNode<T>> childrens) {
		this.childrens = childrens;
	}
	
	
	

}
