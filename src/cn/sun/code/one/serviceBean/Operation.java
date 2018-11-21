package cn.sun.code.one.serviceBean;

/**
 * Created by rider on 2018/11/21.
 * <p>
 * 1.8 业务逻辑的封装
 */
public class Operation {

	public static double getResult(double numberA, double numberB, String operate) {
		double result = 0d;
		switch (operate) {
			case "+":
				result = numberA + numberB;
				break;
			case "-":
				result = numberA - numberB;
				break;
			case "*":
				result = numberA * numberB;
				break;
			case "/":
				result = numberA / numberB;
				break;
		}
		return result;
	}

	public static void main(String[] args) {

	}
}
