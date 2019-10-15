package Loops;


/* 
	Java do-while Loop
	The Java do-while loop is used to iterate a part of the program several times. 
	If the number of iteration is not fixed and you must have to execute the loop at least once, it is recommended to use do-while loop.

	The Java do-while loop is executed at least once because condition is checked after loop body.
	
	Syntax:
		do{  
		//code to be executed
	 	increment/decrement;  
		}while(boolean condition);
 */

public class DoWhileLoop {

	public static void main(String[] args) {

		// Example 1
		int i = 1;
		do {
			System.out.println("Value = " + i);
			i++;
		} while (i <= 5);

		// Example 2
		// Infinity do while loop;
		do {
			System.out.println("infinitive do while loop");
		} while (true);

	}
}