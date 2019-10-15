package variable.and.constant.variable;

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

public class Variable {

	public static void main(String[] args) {
	int a = 5;
		}
}