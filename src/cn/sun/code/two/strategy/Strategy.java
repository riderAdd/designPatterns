package cn.sun.code.two.strategy;

/**
 * Created by rider on 2018/11/22.
 * <p>
 * 抽象算法类
 */
abstract class Strategy {

	// 算法方法
	public abstract void AlgorithmInterface();
}

// 具体算法A
class ConcreteStrategyA extends Strategy {

	// 算法A实现方法
	@Override
	public void AlgorithmInterface() {
		System.out.println("算法A实现");
	}
}

// 具体算法B
class ConcreteStrategyB extends Strategy {

	// 算法B实现方法
	@Override
	public void AlgorithmInterface() {
		System.out.println("算法B实现");
	}
}

// 具体算法C
class ConcreteStrategyC extends Strategy {

	// 算法B实现方法
	@Override
	public void AlgorithmInterface() {
		System.out.println("算法C实现");
	}

}
