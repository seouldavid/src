
public class Test {

	public static void main(String[] args) {
		Employee john = new Employee();
		Son son = new Son();
		System.out.println("하이");
		shout();
		son.parentMethod();
	}

	@Deprecated
	public static void shout() {
		System.out.println("하잉 ");
	}
}

class Parent {
	void parentMethod() {}
}

class Son extends Parent {
	@Override
	@Deprecated
	void parentMethod() {
		System.out.println("");
	}
}