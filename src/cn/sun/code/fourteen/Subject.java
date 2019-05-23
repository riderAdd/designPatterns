package cn.sun.code.fourteen;

import java.util.ArrayList;

/**
 * 主题对象或抽象通知者，一般用一个抽象类或一个接口实现。
 * 它把所有对观察者对象的引用保存在一个聚集里，每个主题都可以用任何数量的观察者。
 * 抽象主题提供一个接口，可以增加和删除观察者对象。
 */
abstract class Subject {

	private ArrayList<Observer> observerArrayList = new ArrayList<Observer>();

	// 增加观察者
	public void attach(Observer observer) {
		observerArrayList.add(observer);
	}

	// 移除观察者
	public void deatch(Observer observer) {
		observerArrayList.remove(observer);
	}

	// 通知
	public void notifyObserver() {
		for (Observer observer : observerArrayList) {
			observer.update();
		}
	}

}
