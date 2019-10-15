package Method.Overloading.and.Overriding;

/*
 * If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
 * In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.
 * 
 * Usage of Java Method Overriding
	1) Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.
	2) Method overriding is used for runtime polymorphism

  *Rules for Java Method Overriding
	1) The method must have the same name as in the parent class
	2) The method must have the same parameter as in the parent class.
	3) There must be an IS-A relationship (inheritance).
 */

class Animal {
	public void food() {
		System.out.println("Animal eat food");
	}
}

class Dog extends Animal {
	public void food() {
		System.out.println("Dog eat food");
	}
}

public class MethodOverridingConcept {

	public static void main(String[] args) {

		Animal a =  new Animal();
		Animal b = new Dog();
		a.food();
		b.food();
	}
}

