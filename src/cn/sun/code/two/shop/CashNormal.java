package cn.sun.code.two.shop;

/**
 * 正常收费子类
 */
public class CashNormal extends CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}

}
