package cn.sun.code.twentyone.shuangchongjiancha;

/**
 * 双重检查加锁单例实现
 */
public class DoubleCheckLockSingleton {

	private static DoubleCheckLockSingleton instance;

	private DoubleCheckLockSingleton() {

	}

	public static DoubleCheckLockSingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckLockSingleton.class) {
				if (instance == null)
					instance = new DoubleCheckLockSingleton();
			}
		}
		return instance;
	}

}
