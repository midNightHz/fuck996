package fuck996.entityPaser;

public interface EntityParser {
	
	
	EntityParser createParser(String str);
	
	/**
	 * ��������
	 * @return
	 */
	Object parser();
	/**
	 * �����Ƿ�Ϊ��
	 * @return
	 */
	boolean isNull();

}
