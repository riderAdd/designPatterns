package cn.sun.code.eight.ifactory;

import cn.sun.code.one.ouhe.Operation;

/**
 * 具体工厂类
 */
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}

}

class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}

class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}

class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}

/**
 * 客户端
 */
class Client {

	public static void main(String[] args) {
		IFactory operFactory = new AddFactory();
		Operation operation = operFactory.createOperation();
		operation.setNumberA(1D);
		operation.setNumberB(2D);
		double result = operation.getResult();
		System.out.println(result);
	}

}
