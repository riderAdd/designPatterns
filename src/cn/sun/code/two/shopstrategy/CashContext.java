package cn.sun.code.two.shopstrategy;

/**
 * Created by rider on 2018/11/22.
 */
public class CashContext {

	// 声明一个CashSuper对象
	private CashSuper cs;

	// 通过构造方法，传入具体的收费策略
	public CashContext(CashSuper cashSuper) {
		this.cs = cashSuper;
	}

	// 根据收费策略的不同，获取计算结果
	public double getResult(double money) {
		return cs.acceptCash(money);
	}

	/**
	 * 客户端代码
	 */
	public static void main(String[] args) {
		CashContext cc = null;
		switch ("") {
			case "正常收费":
				cc = new CashContext(new CashNormal());
				break;
			case "满300减100":
				cc = new CashContext(new CashReturn("300", "100"));
				break;
			case "打8折":
				cc = new CashContext(new CashRebate("0.8"));
				break;
		}
	}

}
