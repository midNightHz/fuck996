package fuck996.collection.stack;

public interface MyStack<T> {
	/**
	 * �Ƿ�Ϊ��
	 * 
	 * @return
	 */
	boolean empty();

	/**
	 * ��ѯջ��Ԫ��
	 * 
	 * @return
	 */
	T peek();

	/**
	 * ��ջ
	 * 
	 * @return
	 */
	T pop();

	/**
	 * ��ջ
	 * 
	 * @param t
	 * @return
	 */

	T push(T t);

}
