package cn.sun.code.two.shopstrategy;

/**
 * 现金收费抽象类
 */
abstract class CashSuper {

	/**
	 * 现金抽取超类的抽象方法
	 *
	 * @param money 原价
	 * @return 当前价
	 */
	public abstract double acceptCash(double money);
}
