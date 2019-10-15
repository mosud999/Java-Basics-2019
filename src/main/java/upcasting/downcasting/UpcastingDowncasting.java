package upcasting.downcasting;

/* 
 * Upcasting is casting to a supertype, while downcasting is casting to a subtype. Upcasting is always allowed, 
 * but downcasting involves a type check and can throw a ClassCastException.
 * 
 * In your case, a cast from a Dog to an Animal is an upcast, because a Dog is-a Animal. 
 * In general, you can upcast whenever there is an is-a relationship between two classes.
 *
 * What is the difference between Parent p = new Child() and Child c = new Child();
 * If you dont know the exact runtime of object then we should use this approach Parent p = new Child() [polymorphis apprach]
 * If you know exactly the run time object then you should use Child c = new Child()
 * Lets say you have stored values in arraylist and when you want the value you dont know the type like String ot int.
 * then you should use Parent means Object reference;
 * if you know the value is exactly which type use chile ref; 
 * 
 * By using parent reference we have to use the method of parent object;
 * By using child reference you can use all the childs methods;
 *
 */

public class UpcastingDowncasting {

	public static void main(String[] args) {
		// Example of upcasting;
		Animal animal = new Dog(); // upcasting using animal reference to dog;
		Dog dog = (Dog) animal; // Downcastingusing dogs reference;
		animal.callme();
		dog.callme();
	}
}

class Animal {
	public void callme() {
		System.out.println("In callme of Animal");
	}
}

class Dog extends Animal {
	public void callme() {
		System.out.println("In callme of Dog");
	}

	public void callme2() {
		System.out.println("In callme2 of Dog");
	}
}

/*
 * 2. Why is Upcasting in Java? Generally, upcasting is not necessary. However,
 * we need upcasting when we want to write general code that deals with only the
 * supertype. Consider the following class:
 * 
 * public class AnimalTrainer { public void teach(Animal anim) { anim.move();
 * anim.eat(); } } Here, the teach() method can accept any object which is
 * subtype of Animal. So objects of type Dog and Cat will be upcasted to Animal
 * when they are passed into this method: Dog dog = new Dog(); Cat cat = new
 * Cat();
 * 
 * AnimalTrainer trainer = new AnimalTrainer(); trainer.teach(dog);
 * trainer.teach(cat);
 */

/*
 * 3. What is Downcasting in Java? Downcasting is casting to a subtype, downward
 * to the inheritance tree. Let’s see an example:
 * 
 * Animal anim = new Cat(); Cat cat = (Cat) anim; Here, we cast the Animal type
 * to the Cat type. As Cat is subclass of Animal, this casting is called
 * downcasting. Unlike upcasting, downcasting can fail if the actual object type
 * is not the target object type. For example:
 * 
 * Animal anim = new Cat(); Dog dog = (Dog) anim;
 */

/*
 * Why is Downcasting in Java? Downcasting is used more frequently than
 * upcasting. Use downcasting when we want to access specific behaviors of a
 * subtype. Consider the following example:
 * 
 * public class AnimalTrainer { public void teach(Animal anim) { // do
 * animal-things anim.move(); anim.eat();
 * 
 * // if there's a dog, tell it barks if (anim instanceof Dog) { Dog dog = (Dog)
 * anim; dog.bark(); } } }
 */

/*
 * This will throw a ClassCastException because the actual object type is Cat.
 * And a Cat is not a Dog so we cannot cast it to a Dog. The Java language
 * provides the instanceof keyword to check type of an object before casting.
 * For example:
 * 
 * if (anim instanceof Cat) { Cat cat = (Cat) anim; cat.meow(); } else if (anim
 * instanceof Dog) { Dog dog = (Dog) anim; dog.bark(); }
 */