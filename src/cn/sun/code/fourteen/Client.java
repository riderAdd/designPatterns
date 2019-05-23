package cn.sun.code.fourteen;

/**
 * 客户端代码
 */
public class Client {

	public static void main(String[] args) {
		ConcreteSubject subject = new ConcreteSubject();

		subject.attach(new ConcreteObserver("雾之国",subject));
		subject.attach(new ConcreteObserver("砂之国",subject));
		subject.attach(new ConcreteObserver("土之国",subject));

		subject.setSubjectStatus("被佩恩攻打");
		subject.notifyObserver();
	}

}
