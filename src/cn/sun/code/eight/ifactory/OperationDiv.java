package cn.sun.code.eight.ifactory;

import cn.sun.code.one.ouhe.Operation;

class OperationDiv extends Operation {

	public double getResult() {
		double result = 0d;
		if(getNumberB()==0)
			throw new RuntimeException("除数不能为0");
		result = this.getNumberA() / this.getNumberB();
		return result;
	}

}
