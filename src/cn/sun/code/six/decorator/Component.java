package cn.sun.code.six.decorator;

abstract class Component {

	public abstract void operation();

}

class ConcreteComponent extends Component {

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}

}

abstract class Decorator extends Component{

	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	// 重写Operation()，实际执行的是Component的Operation()
	@Override
	public void operation() {
		component.operation();
	}

}

class ConcreteDectatorA extends Decorator {

	// 本类独有的功能，以区别于ConcreteDectatorB
	private String addedState;

	// 首先运行原Component的Operation()，再执行本类的功能，如addState，相当于对原Component进行了装饰
	@Override
	public void operation() {
		super.operation();
		addedState = "New State";
		System.out.println("具体装饰对象A的操作");
	}

}

class ConcreteDectatorB extends Decorator {

	@Override
	public void operation() {
		super.operation();
		AddedBehavior();
		System.out.println("具体装饰对象B的操作");
	}

	// 本类独有的方式，以区别于ConcreteDectatorA
	private void AddedBehavior(){

	}

	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDectatorA d1 = new ConcreteDectatorA();
		ConcreteDectatorB d2 = new ConcreteDectatorB();

		// 装饰的方法是：首先用ConcreteComponent实例化对象c，然后用ConcreteDecoratorA的
		// 实例化对象d1来包装c，再用COncreteDecoratorB的对象d2来包装d1，最终执行d2的Operation()
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
	}

}

