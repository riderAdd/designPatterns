package cn.sun.code.twentyone.ehan;

/**
 * 饿汉式单例
 */
public class EagerSingleton {

	private static EagerSingleton singleton = new EagerSingleton();

	private EagerSingleton() {

	}

	public static EagerSingleton getInstance() {
		return singleton;
	}
}
