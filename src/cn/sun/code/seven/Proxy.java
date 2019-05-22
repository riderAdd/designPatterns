package cn.sun.code.seven;

/**
 * Subject类，定义了RealSubject和Proxy的公共接口，这样就在任何使用RealSubject的地方都可以
 * 使用Proxy
 */
interface Subject {

	void request();

}

/**
 * RealSubject类，定义Proxy所代表的真实实体
 */
class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("真实的请求");
	}
}

/**
 * Proxy类，保存一个引用使得代理可以访问实体，并提供一个与Subject的接口相同的接口
 * 这样代理就可以用来代替实体
 */
public class Proxy implements Subject {

	private RealSubject realSubject;

	@Override
	public void request() {
		// 可以在这里给被代理对象定制一些特性
		if (realSubject == null) {
			realSubject = new RealSubject();
		}
		System.out.println("对委托类开始增强");
		realSubject.request();
		System.out.println("对委托类增强结束");
	}

}

/**
 * 客户端代码
 */
class Client {

	public static void main(String[] args) {
		Proxy proxy = new Proxy();
		proxy.request();
	}

}