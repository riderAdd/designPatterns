package cn.sun.code.fourteen;

/**
 * 具体观察者，实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。
 * 具体观察者角色可以保存一个角色可以保存一个指向具体主题对象的应用。
 * 具体观察者角色通常用一个具体子类实现。
 */
public class ConcreteObserver extends Observer {

	private String name;

	private String observerStatus;

	private ConcreteSubject subject;

	public ConcreteObserver(String name, ConcreteSubject subject) {
		this.name = name;
		this.subject = subject;
	}


	@Override
	public void update() {
		observerStatus = subject.getSubjectStatus();
		System.out.println("观察者" + name + "收到木叶新状态是:" + observerStatus);
	}

}
