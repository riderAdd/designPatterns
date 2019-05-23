package cn.sun.code.fourteen;

/**
 * 具体主题或具体通知者，将有关状态存入具体观察者对象；在具体主题的内部状态改变时，
 * 给所有登记过的通知者发出通知。
 * 具体主题角色通常用一个具体子类实现。
 */
public class ConcreteSubject extends Subject {

	private String subjectStatus;

	public String getSubjectStatus() {
		return subjectStatus;
	}

	public void setSubjectStatus(String subjectStatus) {
		this.subjectStatus = subjectStatus;
	}

}
