package fuck996.collection.stack;

public interface MyStack<T> {
	/**
	 * 是否为空
	 * 
	 * @return
	 */
	boolean empty();

	/**
	 * 查询栈顶元素
	 * 
	 * @return
	 */
	T peek();

	/**
	 * 出栈
	 * 
	 * @return
	 */
	T pop();

	/**
	 * 入栈
	 * 
	 * @param t
	 * @return
	 */

	T push(T t);

}
