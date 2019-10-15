package Object;

/*
 * What is an object?
 * Ans: An object is an instance of a class. It has both state and behavior. State means variable and behavior means method.
 * 
 * To user any state and behavior of another class you need to create an object;
 */

public class ObjectInJava {

	public static void main(String[] args) {
		A a = new A();
		a.test();
	}
}

class A {

	public void test() {
		int a = 5;
		int b = 10;
		int c = a + b;

		System.out.println(c);
	}

}