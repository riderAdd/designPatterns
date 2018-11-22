package cn.sun.code.one.ouhe;

/**
 * Created by rider on 2018/11/21.
 * <p>
 * 简单工厂模式
 */
public class OperationFactory {

	public static Operation createOperate(String operate) {
		Operation operation = null;
		switch (operate) {
			case "+":
				operation = new OperationAdd();
				break;
			case "-":
				operation = new OperationSub();
				break;
			case "*":
				operation = new OperationMul();
				break;
			case "/":
				operation = new OperationDiv();
				break;
		}
		return operation;
	}

	/**
	 * 客户端代码
	 * @param args
	 */
	public static void main(String[] args) {
		Operation operation = null;
		operation = OperationFactory.createOperate("+");
		operation.setNumberA(1);
		operation.setNumberB(2);
		double result = operation.getResult();
		System.out.println(result);
	}
}
