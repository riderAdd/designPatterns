package cn.sun.code.fourteen;

import java.util.Observable;
import java.util.Observer;

public class MyTomcat extends Observable {

	private String status = "";

	public String getStatus() {
		return status;
	}

	public MyTomcat(Observer o) {
		addObserver(o);
	}

	public void setStatus(String status) {
		if (!this.status.equals(status)) {
			this.status = status;
			setChanged();
		}
		notifyObservers();
	}

}
