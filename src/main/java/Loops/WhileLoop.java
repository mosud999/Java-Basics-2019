package Loops;


/* 
 * Java While Loop:
 * The Java while loop is used to iterate a part of the program several times. 
 * If the number of iteration is not fixed, it is recommended to use while loop. It has a boolean condition.
   
	while(boolean condition){  
	//code to be executed 
	increment/decrement; 
	}
 */

public class WhileLoop {

	public static void main(String[] args) {

		// Example 1
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}

		// Example 2
		boolean b = true;
		while (b) {
			System.out.println("Passed");
		}

	}
}
