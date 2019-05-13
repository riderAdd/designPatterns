package cn.sun.code.eight.ifactory;

import cn.sun.code.one.ouhe.Operation;

class OperationAdd extends Operation {

	public double getResult() {
		double result = 0d;
		result = this.getNumberA() + this.getNumberB();
		return result;
	}

}
