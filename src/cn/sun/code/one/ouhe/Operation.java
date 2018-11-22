package cn.sun.code.one.ouhe;

/**
 * Created by rider on 2018/11/21.
 * <p>
 * 1.9 紧耦合 vs 松耦合
 */
public class Operation {

	private double numberA;

	private double numberB;

	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}

	public double getResult() {
		double result = 0d;
		return result;
	}
}

class OperationAdd extends Operation {

	public double getResult() {
		double result = 0d;
		result = this.getNumberA() + this.getNumberB();
		return result;
	}

}

class OperationSub extends Operation {

	public double getResult() {
		double result = 0d;
		result = this.getNumberA() - this.getNumberB();
		return result;
	}

}

class OperationMul extends Operation {

	public double getResult() {
		double result = 0d;
		result = this.getNumberA() * this.getNumberB();
		return result;
	}

}

class OperationDiv extends Operation {

	public double getResult() {
		double result = 0d;
		if(getNumberB()==0)
			throw new RuntimeException("除数不能为0");
		result = this.getNumberA() / this.getNumberB();
		return result;
	}

}
