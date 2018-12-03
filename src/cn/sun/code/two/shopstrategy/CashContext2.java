package cn.sun.code.two.shopstrategy;

/**
 * Created by rider on 2018/11/22.
 * 改造后的CashContext
 */
public class CashContext2 {

	CashSuper cs = null;

	public CashContext2(String type) { // 注意参数不是具体的收费策略对象，而是一个字符串，表示收费类型
		switch (type) {
			case "正常收费":
				CashNormal cashNormal = new CashNormal();
				cs = cashNormal;
				break;
			case "满300减100":
				CashReturn cashReturn = new CashReturn("300", "100");
				cs = cashReturn;
				break;
			case "打8折":
				CashRebate cashRebate = new CashRebate("0.8");
				cs = cashRebate;
				break;
			// 将实例化具体策略的过程由客户端转移到Context中。简单工厂的应用
		}
	}

	public double getResult(double money) {
		return cs.acceptCash(money);
	}

}
