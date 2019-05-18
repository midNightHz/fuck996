package fuck996.singleton;

/**
 * 单例模式：一种常用的软件设计模式，其定义是单例对象的类只能允许一个实例存在
 * 
 * 单例模式的设计思路 1、构造方法私有化 2、提供静态方法实例化对象
 * 
 * @author chen
 *
 */
public class Singleton {
	// 传说中的饿汉模式，在类加载时实例化。
	private static Singleton singleton;

	private Singleton() {

	}

	public static Singleton instance() {

		if (singleton == null) {

		}
		return singleton;
	}

}
