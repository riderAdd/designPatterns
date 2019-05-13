package cn.sun.code.twentyone.putong;

/**
 * 单例模式的普通实现
 */
public class Singleton {

	private static Singleton instance;

	// 构造方法让其private，这样就堵死了外界利用new创建此类实例的可能
	private Singleton() {

	}

	// 此方法是获得本类实例的唯一全局访问点
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}

		return instance;
	}

}
