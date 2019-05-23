package cn.sun.code.fourteen;

import java.util.Observable;
import java.util.Observer;

/**
 * 自定义观察者
 */
public class MySpring implements Observer {

	String status = "";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public void update(Observable o, Object arg) {
		this.status = ((MyTomcat) o).getStatus();
		System.out.println("MySpring状态与MyTomcat状态（" + this.status + "）一致");
	}

	/**
	 * 模拟客户端
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// 创建观察者对象
		MySpring mySpring = new MySpring();

		// 创建主题对象，并将观察者对象添加入主题对象
		MyTomcat myTomcat = new MyTomcat(mySpring);

		myTomcat.setStatus("start");
		myTomcat.setStatus("close");

	}

}

