package cn.sun.code.seven;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 */
public class DynamicProxy implements InvocationHandler {

	private Object object;

	public DynamicProxy(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("对委托类开始增强");
		Object invoke = method.invoke(object, args);
		System.out.println("对委托类增强结束");
		return invoke;
	}

}

/**
 * 客户端对象
 */
class Client2 {

	public static void main(String[] args) {
		Subject realSubject = new RealSubject();
		DynamicProxy proxy = new DynamicProxy(realSubject);
		ClassLoader classLoader = realSubject.getClass().getClassLoader();
		Subject subject = (Subject) Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, proxy);
		subject.request();
	}
}
