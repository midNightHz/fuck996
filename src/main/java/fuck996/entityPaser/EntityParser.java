package fuck996.entityPaser;

public interface EntityParser {
	
	
	EntityParser createParser(String str);
	
	/**
	 * 解析对象
	 * @return
	 */
	Object parser();
	/**
	 * 对象是否为空
	 * @return
	 */
	boolean isNull();

}
