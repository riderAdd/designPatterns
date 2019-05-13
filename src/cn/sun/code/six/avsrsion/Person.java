package cn.sun.code.six.avsrsion;

/**
 * 小菜扮靓第一版
 */
public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void wearTshirts() {
		System.out.println("穿T恤");
	}

	public void wearSuit() {
		System.out.println("穿西装");
	}

	public void wearTie() {
		System.out.println("领带");
	}

	// 客户端代码
	public static void main(String[] args) {
		Person person = new Person("小菜");
		System.out.println("第一种装扮:");
		person.wearTshirts();
		person.wearTie();

		Person person2 = new Person("小菜");
		System.out.println("第二种装扮:");
		person2.wearSuit();
		person2.wearTie();
	}

}
