package wrapper.autoboxing.unboxing;

/* 
 * What is variable?
 * Variable is a named memory location to store temporary data;
 * Three types of variables in java:
 * 1) Local Variable
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.

A local variable cannot be defined with "static" keyword.

2) Instance Variable
A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.

It is called instance variable because its value is instance specific and is not shared among instances.

3) Static variable
A variable which is declared as static is called static variable. It cannot be local. You can create a single copy of static variable and share among all the instances of the class. Memory allocation for static variable happens only once when the class is loaded in the memory.
 */

public class WrapperClass {

	public static void main(String[] args) {
	int a = 5;
		}
}

/*
 * 1. Integer.parseInt() Examples Example to convert a String “10” to an
 * primitive int.
 * 
 * String number = "10"; int result = Integer.parseInt(number);
 * System.out.println(result); Copy Output
 * 
 * 10 Copy 2. Integer.valueOf() Examples Alternatively, you can use
 * Integer.valueOf(), it will returns an Integer object.
 * 
 * String number = "10"; Integer result = Integer.valueOf(number);
 * System.out.println(result); Copy Output
 * 
 * 10 Copy Note In summary, parseInt(String) returns a primitive int, whereas
 * valueOf(String) returns a new Integer() object. 3. NumberFormatException If
 * the string does not contain a parsable integer, a NumberFormatException will
 * be thrown.
 * 
 * String number = "10A"; int result = Integer.parseInt(number);
 * System.out.println(result); Copy Output
 * 
 * Exception in thread "main" java.lang.NumberFormatException: For input string:
 * "10A" at java.lang.NumberFormatException.forInputString(Unknown Source) at
 * java.lang.Integer.parseInt(Unknown Source) at
 * java.lang.Integer.valueOf(Unknown Source)
 */