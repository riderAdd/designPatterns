package cn.sun.code.seventeen.basic;

/**
 * 这是客户所期待的接口。目标可以是具体的或者抽象的类，也可以是接口
 */
public class Target {

	public void request() {
		System.out.println("普通请求");
	}

}

/**
 * 需要适配的类
 */
class Adaptee {

	public void specificRequest() {
		System.out.println("特殊请求");
	}
}

/**
 * 通过在内部包装一个Adaptee对象，把源接口转换成目标接口
 */
class Adapter extends Target {

	// 建立一个私有的Adaptee对象
	private Adaptee adaptee = new Adaptee();

	// 这样就可以吧表面上调用request()方法变成实际调用SpecificRequest()方法
	@Override
	public void request() {
		adaptee.specificRequest();
	}

}

/**
 * 客户端代码
 */
class Client {

	public static void main(String[] args) {
		Target target = new Adapter();
		// 对于客户端来说，其实调用的就是Target的request()方法
		target.request();
	}

}