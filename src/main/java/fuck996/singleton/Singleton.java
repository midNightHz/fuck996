package fuck996.singleton;

/**
 * ����ģʽ��һ�ֳ��õ�������ģʽ���䶨���ǵ����������ֻ������һ��ʵ������
 * 
 * ����ģʽ�����˼· 1�����췽��˽�л� 2���ṩ��̬����ʵ��������
 * 
 * @author chen
 *
 */
public class Singleton {
	// ��˵�еĶ���ģʽ���������ʱʵ������
	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton instance() {

		if (singleton == null) {

		}
		return singleton;
	}

}
