package cn.sun.code.two.strategy;

/**
 * Created by rider on 2018/11/22.
 * <p>
 * 上下文
 */
public class Context {

	Strategy strategy = null;

	/**
	 * 初始化时，传入具体的策略对象
	 *
	 * @param strategy
	 */
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * 根据具体的策略对象，调用其算法的方法
	 * <p>
	 * 上下文接口
	 */
	public void ContextInterface() {
		strategy.AlgorithmInterface();
	}

	/**
	 * 客户端代码
	 * 由于实例化不同的策略，所以最终在调用context.ContextInterface时所获得的结果就不尽相同
	 */
	public static void main(String[] args) {
		Context context = null;

		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();

		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();

		context = new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}
}
