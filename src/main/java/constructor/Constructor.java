package constructor;

/* 
 * In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class 
 * is created. At the time of calling constructor, memory for the object is allocated in the memory.
 * 
 * It is a special type of method which is used to initialize the object.
 * 
 * Every time an object is created using the new() keyword, at least one constructor is called.
 * 
 * It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.
 * 
 * There are two types of constructors in Java: no-arg constructor, and parameterized constructor.
 * 
 * ## Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.
 * Rules for creating Java constructor
 * 
 * ## There are two rules defined for the constructor.
 *  ->Constructor name must be the same as its class name
 * 	->A Constructor must have no explicit return type
 * 	->A Java constructor cannot be abstract, static, final, and synchronized
 * 
 * Types of Java constructors
 * There are two types of constructors in Java:
 * 	->Default constructor (no-arg constructor)
 * 	->Parameterized constructor
 * 
 * What is the purpose of a default constructor?
	  The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
 * 
 * ## Syntax of Default Constructor:
 *	 Syntax of default constructor:
		<class_name>(){}
	Example of default constructor
	In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.
		//Java Program to create and call a default constructor  
		class Bike1{  
			//creating a default constructor  
		Bike1(){System.out.println("Bike is created");}  
			//main method  
		public static void main(String args[]){  
			//calling a default constructor  
		Bike1 b=new Bike1();  
			}  
		}
 * ## Java Parameterized Constructor
 * A constructor which has a specific number of parameters is called a parameterized constructor.

 * Why use the parameterized constructor?
The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

Example of parameterized constructor
In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.

//Java Program to demonstrate the use of the parameterized constructor.  
class Student4{  
    int id;  
    String name;  
    	//creating a parameterized constructor  
    Student4(int i,String n){  
    id = i;  
    name = n;  
    }  
    //method to display the values  
    void display(){System.out.println(id+" "+name);}  
   
    public static void main(String args[]){  
    	//creating objects and passing values  
    Student4 s1 = new Student4(111,"Karan");  
    Student4 s2 = new Student4(222,"Aryan");  
    	//calling method to display the values of object  
    s1.display();  
    s2.display();  
   } 
   
    Note: Constructor can be overloaded but can not be overridden.
}  
 */

public class Constructor {

	public static void main(String[] args) {
	
		}
}