package cn.sun.code.six.bversion;

/**
 * 客户端代码
 */
public class Client {

	public static void main(String[] args) {
		Person xc = new Person("小菜");
		System.out.println("第一种装扮");
		Finery tx = new TShirts();
		Finery suit = new Suit();
		Finery tie = new Tie();
		tx.show();
		suit.show();
		tie.show();

	}
}
